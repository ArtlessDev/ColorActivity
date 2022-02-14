package edu.temple.coloractivity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colors = arrayOf("Red", "Green", "Blue", "Yellow", "Cyan", "Magenta", "Gray", "Black")
        val spinner = findViewById<Spinner>(R.id.spinner)
        val listView = findViewById<ListView>(R.id.listView)

        val adapter = ColorAdapter(this, colors)

        spinner.adapter = adapter
        listView.adapter = adapter


    }
}