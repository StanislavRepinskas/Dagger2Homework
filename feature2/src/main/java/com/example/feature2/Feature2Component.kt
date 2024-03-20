package com.example.feature2

import com.example.app_api.AppComponentInterface
import dagger.Component

@Component(
    dependencies = [AppComponentInterface::class]
)
interface Feature2Component {
    fun inject(fragment: Feature2Fragment)

    @Component.Factory
    interface Factory {
        fun create(appComponentInterface: AppComponentInterface): Feature2Component
    }
}