package com.example.saytahminoyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sonuc2.*

class SonucActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonuc2)

        val gelenMesaj = intent.getIntExtra("dogruSayi",0)

        textView3.text = "Doğru Sayı $gelenMesaj"

        buttonTekrarOyna.setOnClickListener {
            val gecis = Intent(this@SonucActivity2,MainActivity::class.java)
            finish()
            startActivity(gecis)
        }
    }

    override fun onBackPressed() {

        val gecis = Intent(this@SonucActivity2,MainActivity::class.java)
        finish()
        startActivity(gecis)
    }
}