package com.example.marlonscheer.projectvkt

import android.os.AsyncTask
import java.io.IOException
import java.net.Socket
import java.nio.charset.Charset


class Async : AsyncTask<String, String, Void>() {


    override fun doInBackground(vararg voids: String): Void? {
        try {

            var lul: String = voids[0]

            val socket = Socket("192.168.178.22", 6002)
            socket.getOutputStream().write("$lul".toByteArray(Charset.defaultCharset()))

            socket.close()

        } catch (e: IOException) {
            e.printStackTrace()
        }

        return null
    }





}