package com.example.feature1.di

import com.example.app_api.di.AppComponentDependencies
import com.example.feature1.Feature1Fragment
import com.example.feature3_api.di.Feature3ComponentDependencies
import dagger.Component

@Component(
    dependencies = [
        AppComponentDependencies::class,
        Feature3ComponentDependencies::class
    ]
)
interface Feature1Component {
    fun inject(fragment: Feature1Fragment)

    @Component.Factory
    interface Factory {
        fun create(
            appComponentDependencies: AppComponentDependencies,
            feature3ComponentDependencies: Feature3ComponentDependencies
        ): Feature1Component
    }
}