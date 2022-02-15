package edu.temple.coloractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colors = arrayOf("White", "Red", "Green", "Blue", "Yellow", "Cyan", "Magenta", "Gray", "Black")
        val spinner = findViewById<Spinner>(R.id.spinner)

        val view = findViewById<ConstraintLayout>(R.id.layout)

        val adapter = ColorAdapter(this, colors, view)

        spinner.adapter = adapter

    }
}