package com.example.feature4_api.di

import com.example.feature4_api.Feature4Repository

interface Feature4ComponentDependencies {
    fun getFeature4Repository(): Feature4Repository

    interface Provider {
        fun getFeature4ComponentDependencies(): Feature4ComponentDependencies
    }

    companion object {
        lateinit var componentDependencies: Feature4ComponentDependencies
    }
}