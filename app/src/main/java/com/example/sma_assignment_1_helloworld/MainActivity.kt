package com.example.sma_assignment_1_helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getSet(view: View)
    {
        val editText = findViewById<EditText>(R.id.editText);
        val msg = editText.text.toString();
        val txtView = findViewById<TextView>(R.id.textView).apply {
            text = msg
        }
    }
}