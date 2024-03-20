package com.example.app_api

interface AppDependenciesProvider {
    fun getAppDependencies(): AppDependencies
}