package com.example.pchampassignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.random.Random

class AnotherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)
    }

    fun onClickBack(view: View){
        val i = Intent(this@AnotherActivity,MainActivity::class.java)

        val randomNumber = Random.nextInt(1, 100)
        i.putExtra("number", randomNumber)
        startActivity(i)
    }
}