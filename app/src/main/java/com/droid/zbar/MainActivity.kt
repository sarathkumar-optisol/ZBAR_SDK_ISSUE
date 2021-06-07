package com.droid.zbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import net.sourceforge.zbar.android.CameraTest.CameraPreview
import net.sourceforge.zbar.android.CameraTest.CameraTestActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val scanningCodeButton = findViewById<Button>(R.id.btnScan)
        scanningCodeButton.setOnClickListener {
            val intent = Intent(this@MainActivity, CameraTestActivity::class.java)
            startActivity(intent)
        }
    }
}