package com.example.pchampassignment1

import android.app.AlertDialog
import android.view.LayoutInflater

class LoadingDialog(val mainActivity: MainActivity) {
    private var dialog: AlertDialog? = null
    fun startLoadingDialog(){
        val builder = AlertDialog.Builder(mainActivity)
        val inflater : LayoutInflater = mainActivity.layoutInflater
        builder.setView(inflater.inflate(R.layout.loading_dialog,null))
        builder.setCancelable(false)
        dialog  = builder.create()
        dialog?.show()

    }

    fun dismissDialog(){
        dialog!!.dismiss()
    }
}