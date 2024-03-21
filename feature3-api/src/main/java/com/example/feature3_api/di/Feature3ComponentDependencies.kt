package com.example.feature3_api.di

import com.example.feature3_api.Feature3Interactor

interface Feature3ComponentDependencies {
    fun getFeature3Interactor(): Feature3Interactor

    interface Provider {
        fun getFeature3ComponentDependencies(): Feature3ComponentDependencies
    }

    companion object {
        lateinit var componentDependencies: Feature3ComponentDependencies
    }
}