package com.example.marlonscheer.projectvkt

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLogin.setOnClickListener {

            var uname = editTextUname.text
            var pass = editTextPass.text

            val realname = "root"
            val realpass = "toor"

            val i = Intent(this, HomeActivity::class.java)

            if (realname.equals(uname) && realpass.equals(pass)){
                startActivity(i)
            }
        }
    }
}