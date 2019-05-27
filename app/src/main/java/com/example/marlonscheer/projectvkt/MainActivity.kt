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

            val uname = editTextUname.text

            val pass = editTextPass.text

            val i = Intent(this, HomeActivity::class.java)
            Snackbar.make(homeView, "Name: $uname Password: $pass", Snackbar.LENGTH_LONG).show()

            startActivity(i)


        }




    }
}
