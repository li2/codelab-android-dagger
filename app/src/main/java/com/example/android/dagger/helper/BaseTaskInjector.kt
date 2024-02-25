package com.example.android.dagger.helper

import com.example.android.dagger.di.Dagger
import com.example.core.common.logger.Logger
import javax.inject.Inject

abstract class BaseTaskInjector {
    @Inject
    lateinit var logger: Logger

    init {
        Dagger.appComponent?.inject(this)
        logger.d("BaseTaskInjector init")
    }
}

class SampleTask @Inject constructor() : BaseTaskInjector() {
    init {
        logger.d("SampleTask init")
    }
}