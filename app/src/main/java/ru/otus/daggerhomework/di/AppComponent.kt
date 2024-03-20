package ru.otus.daggerhomework.di

import android.content.Context
import com.example.app_api.AppDependencies
import com.example.app_api.ApplicationContext
import com.example.app_api.Feature4Dependencies
import com.example.feature4.Feature4Module
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [Feature4Module::class]
)
interface AppComponent : AppDependencies, Feature4Dependencies {

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

}
