package ru.otus.daggerhomework

import android.app.Application
import com.example.app_api.di.AppComponentDependencies
import com.example.feature3_api.di.Feature3ComponentDependencies
import com.example.feature4_api.di.Feature4ComponentDependencies
import ru.otus.daggerhomework.di.DaggerAppComponent

class App : Application(), AppComponentDependencies.Provider {
    private val appComponent = DaggerAppComponent.factory().create(this)

    init {
        setupComponents()
    }

    private fun setupComponents() {
        Feature3ComponentDependencies.componentDependencies = appComponent
        Feature4ComponentDependencies.componentDependencies = appComponent
    }

    override fun getAppComponentDependencies(): AppComponentDependencies {
        return appComponent
    }
}