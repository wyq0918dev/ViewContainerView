package com.wyq0918dev.viewcontainerview

import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ViewContainerManager.build()
            .withContainerView(
                container = findViewById(
                    R.id.container
                )
            )
            .childView(
                child = TextView(
                    this@MainActivity
                ).apply {
                    text = getString(R.string.hello_world)
                    gravity = Gravity.CENTER
                }
            )
            .apply()
    }
}