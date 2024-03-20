package com.example.feature1

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.app_api.AppComponentProvider
import com.example.app_api.ApplicationContext
import com.example.feature3.Feature3Interactor
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
            (requireActivity().application as AppComponentProvider).getComponent()
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
                "", //feature3Interactor.getSomething().toString(),
                Toast.LENGTH_SHORT
            ).show()
        }
        return view
    }
}