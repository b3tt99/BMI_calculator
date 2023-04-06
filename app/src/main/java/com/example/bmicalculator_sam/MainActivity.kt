package com.example.bmicalculator_sam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var display_ans:TextView
    private lateinit var edth:EditText
    private lateinit var edtw:EditText
    private lateinit var calculate_button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display_ans = findViewById(R.id.txtdisplay)
        edth = findViewById(R.id.edtheight)
        edtw = findViewById(R.id.edtweight)
        calculate_button = findViewById(R.id.btncalculate)

        calculate_button.setOnClickListener {
            var height = edth.text.toString().trim()
            var weight = edtw.text.toString().trim()

            if (height.isEmpty() || weight.isEmpty()){
                Toast.makeText(this, "PLEASE ENTER VALUE", Toast.LENGTH_SHORT).show()
            }
            else
                var answer = weight.toDouble() / (height.toDouble() * height.toDouble())
                display_ans = answer.toString()

        }

    }
}