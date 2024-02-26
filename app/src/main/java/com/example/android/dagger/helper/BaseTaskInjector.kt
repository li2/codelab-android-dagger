package com.example.android.dagger.helper

import android.content.Context
import com.example.core.common.logger.Logger
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

abstract class BaseTaskInjector(private val context: Context) {
    // Hilt migration: to perform field injection in classes that Hilt doesn't support.
    // to use Hilt to get some dependencies, you need to define an interface that is annotated with @EntryPoint for each binding type that you want and include qualifiers.
    @EntryPoint
    @InstallIn(SingletonComponent::class)
    interface LoggerEntryPoint {
        fun logger(): Logger
    }

    /*
        @Inject
        lateinit var logger: Logger
    */
    // Hilt migration: To access an entry point, use the appropriate static method from EntryPointAccessors. The parameter should be either the component instance or the @AndroidEntryPoint object that acts as the component holder.
    protected val logger by lazy {
        val appContext = context.applicationContext ?: throw IllegalStateException()
        val hiltEntryPoint =
            EntryPointAccessors.fromApplication(appContext, LoggerEntryPoint::class.java)
        hiltEntryPoint.logger()
    }

    init {
        logger.d("BaseTaskInjector init")
    }
}

class SampleTask @Inject constructor(
    @ApplicationContext private val context: Context
) : BaseTaskInjector(context) {
    init {
        logger.d("SampleTask init")
    }
}
