package com.koko.minipaint

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myCanvasView = MyCanvasView(this)
        //request fullscren for the layer of my cnavas view
        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(window, myCanvasView).let {

            it.hide(WindowInsetsCompat.Type.statusBars())
        }

        myCanvasView.contentDescription = getString(R.string.canvasContentDescription)

        setContentView(myCanvasView)
    }
}