package com.example.lyodsfragment

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var redButton = findViewById<Button>(R.id.buttonRed)
        var blueButton = findViewById<Button>(R.id.buttonBlue)

        redButton.setOnClickListener {
            var redFragment = RedFragment()
            var fragmentManager = supportFragmentManager
            // remove, add , replace
            var ftransaction = fragmentManager.beginTransaction()
            ftransaction.replace(R.id.fragmentContainerView, redFragment)
            ftransaction.commit()
        }

        blueButton.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, BlueFragment()).commit()
        }
    }
}