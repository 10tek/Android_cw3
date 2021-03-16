package kz.step.cw3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class StudentsActivity : AppCompatActivity() {
    var textViewStudents: TextView? = null
    var buttonAlphabetSort: Button? = null
    var buttonRandomSort: Button? = null
    var studentsList: StudentService = StudentService()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students)
        initializeViews()
        initializeListeners()
    }

    fun initializeViews() {
        textViewStudents = findViewById<TextView>(R.id.text_view_activity_students_list)
        buttonAlphabetSort = findViewById<Button>(R.id.button_activity_students_alphabet_sort)
        buttonRandomSort = findViewById<Button>(R.id.button_random_sort)
    }

    fun initializeListeners() {
        buttonAlphabetSort?.setOnClickListener {
            studentsList.alphabetSort()
            textViewStudents?.text = studentsList.toString()
        }

        buttonRandomSort?.setOnClickListener {
            studentsList.randomSort()
            textViewStudents?.text = studentsList.toString()
        }
    }
}