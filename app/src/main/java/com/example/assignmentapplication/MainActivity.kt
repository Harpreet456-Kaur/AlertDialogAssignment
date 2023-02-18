package com.example.assignmentapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    lateinit var btn: FloatingActionButton
    lateinit var tvDialog: TextView
    lateinit var editNum: EditText
    var value = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn)
        btn.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            dialog.setTitle("Alert")
            dialog.setMessage(resources.getString(R.string.app_name))
            dialog.setPositiveButton("Add") { _, _ ->
                value += 10
                editNum.setText(value)
            }
            dialog.setNegativeButton("Multiply") { _, _ ->
                value *= 5
                editNum.setText(value)
            }
            dialog.setNeutralButton("Reset") { _, _ ->
                value = 0
                editNum.setText(value)
            }
            dialog.show()
            dialog.setCancelable(false)
        }
    }
}