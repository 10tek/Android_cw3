package kz.step.cw3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var studentsButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeListeners()
    }

    private fun initializeViews() {
        studentsButton = findViewById(R.id.button_main_activity_students)
    }

    private fun initializeListeners() {
        studentsButton?.setOnClickListener {
            val intent = Intent(this@MainActivity, StudentsActivity::class.java)
            startActivity(intent)
        }
    }
}