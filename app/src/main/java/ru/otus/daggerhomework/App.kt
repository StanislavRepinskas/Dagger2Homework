package ru.otus.daggerhomework

import android.app.Application
import com.example.app_api.AppDependencies
import com.example.app_api.AppDependenciesProvider
import com.example.feature3_api.di.Feature3Dependencies
import com.example.feature3_api.di.Feature3DependenciesProvider
import com.example.feature4_api.di.Feature4Dependencies
import com.example.feature4_api.di.Feature4DependenciesProvider
import ru.otus.daggerhomework.di.AppComponent
import ru.otus.daggerhomework.di.DaggerAppComponent

class App : AppFacadeDependencies() {
    init {
        setupDependencies()
    }
}

open class AppFacadeDependencies : Application(), AppFacadeDependenciesProvider {
    private lateinit var appComponent: AppComponent

    fun setupDependencies() {
        appComponent = DaggerAppComponent.factory().create(this)
    }

    override fun getAppDependencies(): AppDependencies {
        return appComponent
    }

    override fun getFeature3Dependencies(): Feature3Dependencies {
        return appComponent
    }

    override fun getFeature4Dependencies(): Feature4Dependencies {
        return appComponent
    }
}

interface AppFacadeDependenciesProvider :
    AppDependenciesProvider,
    Feature3DependenciesProvider,
    Feature4DependenciesProvider