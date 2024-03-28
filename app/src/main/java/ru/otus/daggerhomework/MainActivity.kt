package ru.otus.daggerhomework

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.app_api.di.AppComponentDependencies
import com.example.feature1.Feature1Fragment
import com.example.feature1.Feature1OtherFragment
import com.example.feature2.Feature2Fragment
import ru.otus.daggerhomework.di.ActivityComponent
import ru.otus.daggerhomework.di.DaggerActivityComponent

class MainActivity : AppCompatActivity() {

    val activityComponent: ActivityComponent by lazy(LazyThreadSafetyMode.NONE) {
        DaggerActivityComponent.factory().create(
            (applicationContext as AppComponentDependencies.Provider).getAppComponentDependencies(),
            this
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonFeature1).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container, Feature1Fragment())
                addToBackStack(null)
                commit()
            }
        }

        findViewById<Button>(R.id.buttonFeature1Other).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container, Feature1OtherFragment())
                addToBackStack(null)
                commit()
            }
        }

        findViewById<Button>(R.id.buttonFeature2).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container, Feature2Fragment())
                addToBackStack(null)
                commit()
            }
        }
    }
}
