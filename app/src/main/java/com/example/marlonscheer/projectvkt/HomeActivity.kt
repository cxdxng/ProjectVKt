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


        arrup.setOnTouchListener(OnTouchListener { view, event ->
            if (event.action == android.view.MotionEvent.ACTION_DOWN) {
                Snackbar.make(homeView, "21 ", Snackbar.LENGTH_SHORT).show()
                arrup.setImageDrawable(getDrawable(R.drawable.arrowupgreen))

            } else if (event.action == android.view.MotionEvent.ACTION_UP) {
                Snackbar.make(homeView, "22", Snackbar.LENGTH_SHORT).show()
                arrup.setImageDrawable(getDrawable(R.drawable.arrowup))

            }
            true
        })


        arrdown.setOnTouchListener(OnTouchListener { view, event ->
            if (event.action == android.view.MotionEvent.ACTION_DOWN) {
                Snackbar.make(homeView, "31", Snackbar.LENGTH_SHORT).show()
                arrdown.setImageDrawable(getDrawable(R.drawable.arrowdowngreen))


            } else if (event.action == android.view.MotionEvent.ACTION_UP) {
                Snackbar.make(homeView, "32", Snackbar.LENGTH_SHORT).show()
                arrdown.setImageDrawable(getDrawable(R.drawable.arrowdown))

            }
            true
        })

        arrleft.setOnTouchListener(OnTouchListener { view, event ->
            if (event.action == android.view.MotionEvent.ACTION_DOWN) {
                Snackbar.make(homeView, "41", Snackbar.LENGTH_SHORT).show()
                arrleft.setImageDrawable(getDrawable(R.drawable.arrowleftgreen))


            } else if (event.action == android.view.MotionEvent.ACTION_UP) {
                Snackbar.make(homeView, "42", Snackbar.LENGTH_SHORT).show()
                arrleft.setImageDrawable(getDrawable(R.drawable.arrowleft))

            }
            true
        })

        arrright.setOnTouchListener(OnTouchListener { view, event ->
            if (event.action == android.view.MotionEvent.ACTION_DOWN) {
                Snackbar.make(homeView, "51", Snackbar.LENGTH_SHORT).show()
                arrright.setImageDrawable(getDrawable(R.drawable.arrowrightgreen))


            } else if (event.action == android.view.MotionEvent.ACTION_UP) {
                Snackbar.make(homeView, "52", Snackbar.LENGTH_SHORT).show()
                arrright.setImageDrawable(getDrawable(R.drawable.arrowright))

            }
            true
        })



    }
}
