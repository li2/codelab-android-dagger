package com.example.android.dagger.helper

import com.example.android.dagger.BuildConfig
import com.example.core.common.helper.ResourceHelper
import javax.inject.Inject
import kotlin.random.Random

class ResourceHelperImpl @Inject constructor() : ResourceHelper {
    override val baseUrl: String
        get() = "${Random.nextInt(until = 100)}"

    // mimic BuildConfig
    override val debug: Boolean
        get() = BuildConfig.DEBUG
}