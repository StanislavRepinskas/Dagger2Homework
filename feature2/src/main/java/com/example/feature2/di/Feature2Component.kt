package com.example.feature2.di

import com.example.app_api.di.AppComponentDependencies
import com.example.feature2.Feature2Fragment
import dagger.Component

@Component(
    dependencies = [AppComponentDependencies::class]
)
interface Feature2Component {
    fun inject(fragment: Feature2Fragment)

    @Component.Factory
    interface Factory {
        fun create(appComponentDependencies: AppComponentDependencies): Feature2Component
    }
}