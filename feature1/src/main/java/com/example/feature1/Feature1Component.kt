package com.example.feature1

import com.example.app_api.AppDependencies
import com.example.feature3_api.di.Feature3Dependencies
import dagger.Component

@Component(
    dependencies = [
        AppDependencies::class,
        Feature3Dependencies::class
    ]
)
interface Feature1Component {
    fun inject(fragment: Feature1Fragment)

    @Component.Factory
    interface Factory {
        fun create(
            appDependencies: AppDependencies,
            feature3Dependencies: Feature3Dependencies
        ): Feature1Component
    }
}