package com.example.feature1

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.createViewModelLazy
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import com.example.app_api.ApplicationContext
import com.example.app_api.di.AppComponentDependencies
import com.example.feature1.di.DaggerFeature1Component
import com.example.feature3_api.Feature3Interactor
import com.example.feature3_api.di.Feature3ComponentDependencies
import javax.inject.Inject

class Feature1OtherFragment : BaseFragment() {

    @Inject
    @ApplicationContext
    lateinit var appContext: Context

    @Inject
    lateinit var feature3Interactor: Feature3Interactor


    private val viewModel: Feature1OtherViewModel by baseViewModels()

    override fun onAttach(context: Context) {
        super.onAttach(context)

        DaggerFeature1Component.factory().create(
            (requireActivity().application as AppComponentDependencies.Provider).getAppComponentDependencies(),
            Feature3ComponentDependencies.componentDependencies
        ).inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        println("TEST! viewModel.value=${viewModel.value}")
        val view = inflater.inflate(R.layout.fragment_feature1, container, false)
        view.findViewById<TextView>(R.id.textView).text = "OtherFragment1"
        view.setOnClickListener {
            Toast.makeText(
                appContext,
                feature3Interactor.getSomething().toString(),
                Toast.LENGTH_SHORT
            ).show()
        }
        return view
    }
}