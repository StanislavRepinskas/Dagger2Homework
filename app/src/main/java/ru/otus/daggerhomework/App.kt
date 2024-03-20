package ru.otus.daggerhomework

import android.app.Application
import com.example.app_api.AppDependencies
import com.example.app_api.AppDependenciesProvider
import com.example.app_api.Feature4Dependencies
import com.example.app_api.Feature4DependenciesProvider
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

    override fun getFeature4Dependencies(): Feature4Dependencies {
        return appComponent
    }
}

interface AppFacadeDependenciesProvider : AppDependenciesProvider, Feature4DependenciesProvider