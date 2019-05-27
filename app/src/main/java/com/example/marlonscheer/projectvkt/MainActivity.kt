package com.example.marlonscheer.projectvkt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLogin.setOnClickListener {

            val uname = editTextUname.text

            //textViewLogin.setText(uname)

            val pass = editTextPass.text

            Snackbar.make(rootlay, "Name: $uname Password: $pass", Snackbar.LENGTH_LONG).show()


        }




    }
}
