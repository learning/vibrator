package com.durex.vibrator

import android.app.Service
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.widget.Switch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vibrator: Vibrator = getSystemService(Service.VIBRATOR_SERVICE) as Vibrator
        val button = findViewById<Switch>(R.id.switchButton)

        button.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // 开关打开
                vibrator.vibrate(1000000)
            } else {
                // 开关关闭
                vibrator.cancel()
            }
        }
    }
}
