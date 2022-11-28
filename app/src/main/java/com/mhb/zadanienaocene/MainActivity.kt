package com.mhb.zadanienaocene

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

fun silnia(liczba: Int): Int{
    if(liczba>1){
        return liczba * silnia(liczba-1)
    }
    else{
        return 0
    }
}



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var i=1
            findViewById<Button>(R.id.prawo).setOnClickListener {
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
        findViewById<Button>(R.id.lewo).setOnClickListener {
            i-=1
            if(i<=0){
                i=3
            }
            if(i==1) {
                findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.truskawka)
            }

            if(i==2) {
                findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.czeresnie)
            }

            if(i==3) {
                findViewById<ImageView>(R.id.zdjecie).setImageResource(R.drawable.gruszki)
            }


        }
        findViewById<Button>(R.id.silnia).setOnClickListener {
            val z=findViewById<EditText>(R.id.wprowadz)
            val y=z.text.toString().toInt()
            val wynik= silnia(y).toString()
            findViewById<TextView>(R.id.wynik).text=wynik
        }
        }
    }
