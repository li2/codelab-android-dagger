package com.example.core.common.user

import com.example.core.common.storage.Storage
import javax.inject.Inject
import javax.inject.Singleton

private const val REGISTERED_USER = "registered_user"
private const val PASSWORD_SUFFIX = "password"

/**
 * Handles User lifecycle. Manages registrations, logs in and logs out.
 * Knows when the user is logged in.
 *
 * Marked with @Singleton since we only one an instance of UserManager in the application graph.
 */
@Singleton
class UserManager @Inject constructor(
    private val storage: Storage,
) {

    /**
    *  UserComponent is specific to a logged in user. Holds an instance of UserComponent.
    *  This determines if the user is logged in or not, when the user logs in,
    *  a new Component will be created. When the user logs out, this will be null.
    */
    var userComponent: Boolean? = null
        private set

    val username: String
        get() = storage.getString(REGISTERED_USER)

    fun isUserLoggedIn() = userComponent == true

    fun isUserRegistered() = storage.getString(REGISTERED_USER).isNotEmpty()

    fun registerUser(username: String, password: String) {
        storage.setString(REGISTERED_USER, username)
        storage.setString("$username$PASSWORD_SUFFIX", password)
        userJustLoggedIn()
    }

    fun loginUser(username: String, password: String): Boolean {
        val registeredUser = this.username
        if (registeredUser != username) return false

        val registeredPassword = storage.getString("$username$PASSWORD_SUFFIX")
        if (registeredPassword != password) return false

        userJustLoggedIn()
        return true
    }

    fun logout() {
        // When the user logs out, we remove the instance of UserComponent from memory
        userComponent = false
    }

    fun unregister() {
        val username = storage.getString(REGISTERED_USER)
        storage.setString(REGISTERED_USER, "")
        storage.setString("$username$PASSWORD_SUFFIX", "")
        logout()
    }

    private fun userJustLoggedIn() {
        // When the user logs in, we create a new instance of UserComponent
        userComponent = true
    }
}