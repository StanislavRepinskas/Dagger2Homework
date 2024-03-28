package com.example.feature1.di

import androidx.lifecycle.ViewModel
import com.example.app_api.di.AppComponentDependencies
import com.example.app_api.di.ViewModelKey
import com.example.app_api.di.ViewModelFactoryModule
import com.example.feature1.Feature1Fragment
import com.example.feature1.Feature1OtherFragment
import com.example.feature1.Feature1OtherViewModel
import com.example.feature1.Feature1ViewModel
import com.example.feature3_api.di.Feature3ComponentDependencies
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.multibindings.IntoMap

@Component(
    dependencies = [
        AppComponentDependencies::class,
        Feature3ComponentDependencies::class
    ],
    modules = [Feature1Module::class]
)
interface Feature1Component {
    fun inject(fragment: Feature1Fragment)
    fun inject(fragment: Feature1OtherFragment)

    @Component.Factory
    interface Factory {
        fun create(
            appComponentDependencies: AppComponentDependencies,
            feature3ComponentDependencies: Feature3ComponentDependencies
        ): Feature1Component
    }
}

@Module(includes = [ViewModelFactoryModule::class])
internal interface Feature1Module {

    @Binds
    @IntoMap
    @ViewModelKey(Feature1ViewModel::class)
    fun bindFeature1ViewModel(viewModel: Feature1ViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(Feature1OtherViewModel::class)
    fun bindFeature1OtherViewModel(viewModel: Feature1OtherViewModel): ViewModel
}