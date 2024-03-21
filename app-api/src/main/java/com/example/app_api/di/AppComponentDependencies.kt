package com.example.app_api.di

import android.content.Context
import com.example.app_api.ApplicationContext

interface AppComponentDependencies {

    @ApplicationContext
    fun provideApplicationContext(): Context

    interface Provider {
        fun getAppComponentDependencies(): AppComponentDependencies
    }
}