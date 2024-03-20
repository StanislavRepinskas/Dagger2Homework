package com.example.feature1

import com.example.app_api.AppDependencies
import com.example.feature4_api.di.Feature4Dependencies
import dagger.Component

@Component(
    dependencies = [
        AppDependencies::class,
        Feature4Dependencies::class
    ]
)
interface Feature1Component {
    fun inject(fragment: Feature1Fragment)

    @Component.Factory
    interface Factory {
        fun create(
            appDependencies: AppDependencies,
            feature4Dependencies: Feature4Dependencies
        ): Feature1Component
    }
}