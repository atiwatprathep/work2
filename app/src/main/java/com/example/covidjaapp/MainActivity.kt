package com.example.covidjaapp

import android.app.ProgressDialog.show
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast_pass =Toast.makeText(applicationContext ,"การลงทะเบียสำเร็จ",Toast.LENGTH_LONG)
        val toast_failPass=Toast.makeText(applicationContext ,"กรุณาเปลี่ยนรหัส รหัสผ่านเเละUserห้ามเหมือนกัน",Toast.LENGTH_LONG)
        val toast_fail=Toast.makeText(applicationContext ,"กรุณากรอกข้อมูลให้ถูกต้อง",Toast.LENGTH_LONG)

        bOK.setOnClickListener (){
            if ( editName.text.toString()  == editPass.text.toString()  )
                toast_failPass.show()

        else if (editPass.text.toString() == editcon.text.toString()) {
                toast_pass.show()
            }
        else{
        toast_fail.show()}
    }
        Claer.setOnClickListener() {
            editName.setText(null)
            editPass.setText(null)
            editcon.setText(null)
        }
        }
    }




