package com.example.marlonscheer.projectvkt

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View.OnTouchListener
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //Load WebView
        webView.loadUrl("https://github.com")
        //Confirm Connection
        Async().execute("Connection success")
        //Close Socket
        buttonClose.setOnClickListener {
            finish()
        }

        arrup.setOnTouchListener(OnTouchListener { view, event ->
            //Checks State of arrow
            if (event.action == android.view.MotionEvent.ACTION_DOWN) {
                //Show Code in Snackbar
                Snackbar.make(homeView, "21 ", Snackbar.LENGTH_SHORT).show()
                //Change Icon
                arrup.setImageDrawable(getDrawable(R.drawable.arrowupgreen))
                //Send Code to AsyncTask
                Async().execute("21")

            } else if (event.action == android.view.MotionEvent.ACTION_UP) {
                //Show Code in Snackbar
                Snackbar.make(homeView, "22", Snackbar.LENGTH_SHORT).show()
                //Change Icon
                arrup.setImageDrawable(getDrawable(R.drawable.arrowup))
                //Send Code to AsyncTask
                Async().execute("22")

            }
            true
        })


        arrdown.setOnTouchListener(OnTouchListener { view, event ->
            //Checks State of arrow
            if (event.action == android.view.MotionEvent.ACTION_DOWN) {
                //Show Code in Snackbar
                Snackbar.make(homeView, "31", Snackbar.LENGTH_SHORT).show()
                //Change Icon
                arrdown.setImageDrawable(getDrawable(R.drawable.arrowdowngreen))
                //Send Code to AsyncTas
                Async().execute("31")

            } else if (event.action == android.view.MotionEvent.ACTION_UP) {
                //Show Code in Snackbar
                Snackbar.make(homeView, "32", Snackbar.LENGTH_SHORT).show()
                //Change Icon
                arrdown.setImageDrawable(getDrawable(R.drawable.arrowdown))
                //Send Code to AsyncTask
                Async().execute("32")


            }
            true
        })

        arrleft.setOnTouchListener(OnTouchListener { view, event ->
            //Checks State of arrow
            if (event.action == android.view.MotionEvent.ACTION_DOWN) {
                //Show Code in Snackbar
                Snackbar.make(homeView, "41", Snackbar.LENGTH_SHORT).show()
                //Change Icon
                arrleft.setImageDrawable(getDrawable(R.drawable.arrowleftgreen))
                //Send Code to AsyncTask
                Async().execute("41")

            } else if (event.action == android.view.MotionEvent.ACTION_UP) {
                //Show Code in Snackbar
                Snackbar.make(homeView, "42", Snackbar.LENGTH_SHORT).show()
                //Change Icon
                arrleft.setImageDrawable(getDrawable(R.drawable.arrowleft))
                //Send Code to AsyncTask
                Async().execute("42")

            }
            true
        })

        arrright.setOnTouchListener(OnTouchListener { view, event ->
            //Checks State of arrow
            if (event.action == android.view.MotionEvent.ACTION_DOWN) {
                //Show Code in Snackbar
                Snackbar.make(homeView, "51", Snackbar.LENGTH_SHORT).show()
                //Change Icon
                arrright.setImageDrawable(getDrawable(R.drawable.arrowrightgreen))
                //Send Code to AsyncTask
                Async().execute("51")

            } else if (event.action == android.view.MotionEvent.ACTION_UP) {
                //Show Code in Snackbar
                Snackbar.make(homeView, "52", Snackbar.LENGTH_SHORT).show()
                //Change Icon
                arrright.setImageDrawable(getDrawable(R.drawable.arrowright))
                //Send Code to AsyncTask
                Async().execute("52")
            }
            true
        })



    }
}
