package com.tyeralin.twodisplaydevice

import android.app.Activity
import android.app.Presentation
import android.content.Context
import android.os.Bundle
import android.view.Display
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondPresentation(outerContext: Context?, display: Display?) :
    Presentation(outerContext, display) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_dispaly_p);
        initViews()
    }

    private fun initViews() {
        findViewById<TextView>(R.id.tv).setOnClickListener { v ->
            Toast.makeText(context, "tv", Toast.LENGTH_LONG).show()
        }

        findViewById<Button>(R.id.button).setOnClickListener {
            Toast.makeText(context, "bt", Toast.LENGTH_LONG).show()

        }


    }


}