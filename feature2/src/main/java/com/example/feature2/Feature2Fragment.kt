package com.example.feature2

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.app_api.AppComponentProvider
import com.example.app_api.ApplicationContext
import javax.inject.Inject

class Feature2Fragment : Fragment() {

    @Inject
    @ApplicationContext
    lateinit var appContext: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        DaggerFeature2Component.factory().create(
            (requireActivity().application as AppComponentProvider).getComponent()
        ).inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature2, container, false)
    }
}