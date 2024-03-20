package com.example.app_api

import android.content.Context

interface AppDependencies {

    @ApplicationContext
    fun provideApplicationContext(): Context
}