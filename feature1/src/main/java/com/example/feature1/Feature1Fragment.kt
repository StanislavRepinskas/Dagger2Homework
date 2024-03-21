package com.example.feature1

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.app_api.ApplicationContext
import com.example.app_api.di.AppComponentDependencies
import com.example.feature1.di.DaggerFeature1Component
import com.example.feature3_api.Feature3Interactor
import com.example.feature3_api.di.Feature3ComponentDependencies
import javax.inject.Inject

class Feature1Fragment : Fragment() {

    @Inject
    @ApplicationContext
    lateinit var appContext: Context

    @Inject
    lateinit var feature3Interactor: Feature3Interactor

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
        val view = inflater.inflate(R.layout.fragment_feature1, container, false)
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