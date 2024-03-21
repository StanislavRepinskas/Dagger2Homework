package com.example.feature3

import android.content.Context
import com.example.app_api.ApplicationContext
import com.example.feature3_api.Feature3Interactor
import com.example.feature4_api.Feature4Repository
import javax.inject.Inject

class Feature3InteractorImpl @Inject constructor(
    @ApplicationContext
    val context: Context,
    val feature4Repository: Feature4Repository
) : Feature3Interactor {

    override fun getSomething(): Int {
        return feature4Repository.getInt()
    }
}