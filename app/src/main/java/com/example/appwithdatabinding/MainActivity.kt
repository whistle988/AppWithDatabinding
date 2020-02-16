package com.example.appwithdatabinding

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.appwithdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var activityMainBinding : ActivityMainBinding? = null
    private var handlers : MainActivityClickHandlers? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var activityMainBinding = this.activityMainBinding
        var handlers = this.handlers

        //tvStudentName.setText(getCurrentStudent()!!.studentName)
        //tvStudentEmail.setText(getCurrentStudent()!!.studentEmail)

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        activityMainBinding.student = getCurrentStudent()

        handlers = MainActivityClickHandlers(this)
        activityMainBinding.clickHandler = handlers
    }

    private fun getCurrentStudent(): Student? {
        val student = Student()
        student.studentName = "Alex"
        student.studentEmail = "alex@gmail.com"
        return student
    }

    class MainActivityClickHandlers(val context: Context) {

        fun onEnrollButtonClicked() {
            Toast.makeText(context, " Enroll Clicked", Toast.LENGTH_LONG).show()
        }

        fun onCancelButtonClicked() {
            Toast.makeText(context, " Cancel Clicked", Toast.LENGTH_LONG).show()
        }
    }
}
