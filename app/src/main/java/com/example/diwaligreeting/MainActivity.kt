package com.example.diwaligreeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageDiwali: ImageView = findViewById(R.id.imageView)
        var x = 1
        thread(start = true) {
            while (x > 0) {
                Thread.sleep(3000)
                runOnUiThread {
                    when (x) {
                        1 -> imageDiwali.setImageResource(R.drawable.diwali2)
                        2 -> imageDiwali.setImageResource(R.drawable.diwali3)
                        3 -> imageDiwali.setImageResource(R.drawable.diwali4)
                        4 -> imageDiwali.setImageResource(R.drawable.diwali5)
                        5 -> imageDiwali.setImageResource(R.drawable.diwali6)
                        6 -> imageDiwali.setImageResource(R.drawable.diwali7)
                        7 -> imageDiwali.setImageResource(R.drawable.diwali8)
                        8 -> imageDiwali.setImageResource(R.drawable.diwali9)
                        9 -> imageDiwali.setImageResource(R.drawable.diwali10)
                    }

                    if (x == 9) x = 0
                }
                x++
            }
        }
    }
}
