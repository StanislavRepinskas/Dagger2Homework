package com.example.app_api

import android.content.Context

interface AppComponentInterface {

    @ApplicationContext
    fun provideApplicationContext(): Context
}