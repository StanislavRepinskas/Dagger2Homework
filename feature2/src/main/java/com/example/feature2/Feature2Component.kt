package com.example.feature2

import com.example.app_api.AppDependencies
import dagger.Component

@Component(
    dependencies = [AppDependencies::class]
)
interface Feature2Component {
    fun inject(fragment: Feature2Fragment)

    @Component.Factory
    interface Factory {
        fun create(appDependencies: AppDependencies): Feature2Component
    }
}