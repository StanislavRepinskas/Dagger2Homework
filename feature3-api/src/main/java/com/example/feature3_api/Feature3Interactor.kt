package com.example.feature3_api

import android.content.Context
import com.example.app_api.ApplicationContext
import com.example.feature4_api.Feature4Repository
import javax.inject.Inject

interface Feature3Interactor {
    fun getSomething(): Int
}