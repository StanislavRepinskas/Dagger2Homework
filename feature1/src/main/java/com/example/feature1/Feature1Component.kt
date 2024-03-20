package com.example.feature1

import com.example.app_api.AppComponentInterface
import dagger.Component

@Component(
    dependencies = [
        AppComponentInterface::class
    ]
)
interface Feature1Component {
    fun inject(fragment: Feature1Fragment)

    @Component.Factory
    interface Factory {
        fun create(
            appComponentInterface: AppComponentInterface
        ): Feature1Component
    }
}