package com.mhb.zadanienaocene

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var i=0
            findViewById<Button>(R.id.lewo).setOnClickListener {
                i+=1
                if(i==1) {
                    findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.truskawka)
                }

                if(i==2) {
                    findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.czeresnie)
                }

                if(i==3) {
                    findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.gruszki)
                    i=0
                }


            }
        var j=0
        findViewById<Button>(R.id.prawo).setOnClickListener {
            j+=1
            if(j==1) {
                findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.truskawka)
            }

            if(j==2) {
                findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.czeresnie)
            }

            if(j==3) {
                findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.gruszki)
                j=0
            }


        }
        }
    }
