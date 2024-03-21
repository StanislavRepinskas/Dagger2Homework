package ru.otus.daggerhomework.di

import android.content.Context
import com.example.app_api.AppDependencies
import com.example.app_api.ApplicationContext
import com.example.feature3.Feature3Module
import com.example.feature3_api.di.Feature3Dependencies
import com.example.feature4_api.di.Feature4Dependencies
import com.example.feature4.Feature4Module
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        Feature3Module::class,
        Feature4Module::class
    ]
)
interface AppComponent :
    AppDependencies,
    Feature3Dependencies,
    Feature4Dependencies {

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
