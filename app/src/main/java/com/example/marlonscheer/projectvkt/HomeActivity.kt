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



        webView.loadUrl("https://github.com")
        Async().execute("Connection success")

        buttonClose.setOnClickListener {
            finish()
        }

        arrup.setOnTouchListener(OnTouchListener { view, event ->
            if (event.action == android.view.MotionEvent.ACTION_DOWN) {
                Snackbar.make(homeView, "21 ", Snackbar.LENGTH_SHORT).show()
                arrup.setImageDrawable(getDrawable(R.drawable.arrowupgreen))
                Async().execute("21")


            } else if (event.action == android.view.MotionEvent.ACTION_UP) {
                Snackbar.make(homeView, "22", Snackbar.LENGTH_SHORT).show()
                arrup.setImageDrawable(getDrawable(R.drawable.arrowup))
                Async().execute("22")

            }
            true
        })


        arrdown.setOnTouchListener(OnTouchListener { view, event ->
            if (event.action == android.view.MotionEvent.ACTION_DOWN) {
                Snackbar.make(homeView, "31", Snackbar.LENGTH_SHORT).show()
                arrdown.setImageDrawable(getDrawable(R.drawable.arrowdowngreen))
                Async().execute("31")


            } else if (event.action == android.view.MotionEvent.ACTION_UP) {
                Snackbar.make(homeView, "32", Snackbar.LENGTH_SHORT).show()
                arrdown.setImageDrawable(getDrawable(R.drawable.arrowdown))
                Async().execute("32")


            }
            true
        })

        arrleft.setOnTouchListener(OnTouchListener { view, event ->
            if (event.action == android.view.MotionEvent.ACTION_DOWN) {
                Snackbar.make(homeView, "41", Snackbar.LENGTH_SHORT).show()
                arrleft.setImageDrawable(getDrawable(R.drawable.arrowleftgreen))
                Async().execute("41")



            } else if (event.action == android.view.MotionEvent.ACTION_UP) {
                Snackbar.make(homeView, "42", Snackbar.LENGTH_SHORT).show()
                arrleft.setImageDrawable(getDrawable(R.drawable.arrowleft))
                Async().execute("42")

            }
            true
        })

        arrright.setOnTouchListener(OnTouchListener { view, event ->
            if (event.action == android.view.MotionEvent.ACTION_DOWN) {
                Snackbar.make(homeView, "51", Snackbar.LENGTH_SHORT).show()
                arrright.setImageDrawable(getDrawable(R.drawable.arrowrightgreen))
                Async().execute("51")



            } else if (event.action == android.view.MotionEvent.ACTION_UP) {
                Snackbar.make(homeView, "52", Snackbar.LENGTH_SHORT).show()
                arrright.setImageDrawable(getDrawable(R.drawable.arrowright))
                Async().execute("52")


            }
            true
        })



    }
}
