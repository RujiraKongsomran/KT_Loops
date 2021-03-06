package com.rujirakongsomran.kt_loops

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlayString.setOnClickListener {
            // For loop
//            val items1 = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//            for (index in items1)
//                Log.d("DEBUG", "" + index)
//
//            val items2 = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//            for (index in items2.indices)
//                Log.d("DEBUG", "index : $index = ${items2[index]}")
//
//            val items3 = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//            for ((index, value) in items3.withIndex())
//                Log.d("DEBUG", "index : $index = $value")

            // While Loop
//            var x = 0
//            while (x < 10) {
//                Log.d("DEBUG", "" + x)
//                x++
//            }

            // Do - While Loop
//            var x = 0
//            do {
//                Log.d("DEBUG", "" + x)
//                x++
//            } while (x < 10)

            // break and continue
            var x = 0
            while (x < 10) {
                x++
                if (x % 2 != 0)
                    Log.d("DEBUG", "X =  $x")
                else {
                    break
                }
            }
        }
    }
}