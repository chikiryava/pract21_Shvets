package com.bignerdranch.android.criminalintent

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.webkit.WebView.FindListener
import android.widget.TextView
import org.w3c.dom.Text
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


class MainActivity2 : AppCompatActivity() {
    lateinit var texts:TextView
    private lateinit var backButton: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var date = getString(R.string.date)
        texts=findViewById(R.id.text)
        backButton = findViewById<FloatingActionButton>(R.id.backButton)
        var cont = findViewById<View>(android.R.id.content)
        val currentDate = Date()
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH) + 1
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        val hours = calendar.get(Calendar.HOUR_OF_DAY)
        val minutes = calendar.get(Calendar.MINUTE)

        val dateFormat: DateFormat = SimpleDateFormat(date, Locale.getDefault())


        val currentdateTime = DateFormat.getDateTimeInstance().format(Date())
        texts.text = currentdateTime


        var snack=Snackbar.make(cont,R.string.crime,Snackbar.LENGTH_INDEFINITE)
        snack.setAction("OK",View.OnClickListener {
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }).show()
        backButton.setOnClickListener{
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}