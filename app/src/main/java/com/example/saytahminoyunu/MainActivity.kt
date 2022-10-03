package com.example.saytahminoyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        buttonOyna.setOnClickListener {
            val sayi = Random.nextInt(0,101)

            val gecis = Intent(this@MainActivity,OyunActivity2::class.java)
            gecis.putExtra("rastgeleSayi",sayi)
            startActivity(gecis)


        }
    }
}