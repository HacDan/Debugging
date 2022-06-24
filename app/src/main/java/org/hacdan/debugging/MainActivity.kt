package org.hacdan.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logging()
        division()
    }

    fun logging() {
        Log.v(TAG,"Hello, world!")
    }

    fun division() {
        var numerator = 60
        var denominator = 4

        repeat(5) {
            Log.d(TAG, "$denominator")
            Log.v(TAG, "${numerator / denominator}")
            denominator--
        }
    }
}