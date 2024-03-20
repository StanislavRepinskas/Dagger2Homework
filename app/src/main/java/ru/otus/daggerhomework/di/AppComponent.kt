package ru.otus.daggerhomework.di

import android.content.Context
import com.example.app_api.AppComponentInterface
import com.example.app_api.ApplicationContext
import com.example.feature4.Feature4Module
import com.example.feature4_api.Feature4Repository
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [Feature4Module::class]
)
interface AppComponent : AppComponentInterface {

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance
            @ApplicationContext
            context: Context
        ): AppComponent
    }

    @ApplicationContext
    override fun provideApplicationContext(): Context

    fun provideFeature4Repository(): Feature4Repository
}
