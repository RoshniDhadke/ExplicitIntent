package com.example.explicit_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun Secondactivity(view: View) {
        val i= Intent(applicationContext,MainActivity::class.java)
        startActivity(i)
    }
}