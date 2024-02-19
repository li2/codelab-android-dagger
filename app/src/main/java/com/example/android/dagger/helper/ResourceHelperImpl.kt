package com.example.android.dagger.helper

import com.example.core.common.helper.ResourceHelper
import kotlin.random.Random

class ResourceHelperImpl: ResourceHelper {
    override val baseUrl: String
        get() = "${Random.nextInt(until = 100)}"
}