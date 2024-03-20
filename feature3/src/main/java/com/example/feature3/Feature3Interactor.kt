package com.example.feature3

import android.content.Context
import com.example.app_api.ApplicationContext
import com.example.feature4_api.Feature4Repository
import javax.inject.Inject

class Feature3Interactor @Inject constructor(
    @ApplicationContext
    val context: Context,
    val feature4Repository: Feature4Repository
) {

    fun getSomething(): Int {
        return feature4Repository.getInt()
    }
}