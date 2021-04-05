package com.example.pchampassignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var num : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        num = intent.getIntExtra("number",0)
        Toast.makeText(applicationContext,"Number : $num",Toast.LENGTH_LONG).show()
    }
    val loadingDialog = LoadingDialog(this)


    fun onClickNext(view:View){
        loadingDialog.startLoadingDialog()
        val handler = Handler()
        handler.postDelayed({
            loadingDialog.dismissDialog()
        },3000)
        val i = Intent(this@MainActivity,AnotherActivity::class.java)
        startActivity(i)
    }

}