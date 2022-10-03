package com.example.saytahminoyunu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_oyun2.*
import kotlin.random.Random

class OyunActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oyun2)


        var randomSayi = intent.getIntExtra("rastgeleSayi",0)
        var hak = 5
        kalanHak.text = "Kalan Hak $hak"

        buttonTahminEt.setOnClickListener {
            var tahmin = tahminGiris.text.toString().toInt()

            if (tahmin == randomSayi){
                tahminSonuc.text = "TEBRİKLER KAZANDINIZ"
            }

            if (tahmin < randomSayi){
                tahminSonuc.text = "Tahmininiz Arttırınız"
                hak--
                kalanHak.text = "Kalan Hak $hak"
            }

            if (tahmin > randomSayi){
                tahminSonuc.text = "Tahmininiz Azaltınız"
                hak--
                kalanHak.text = "Kalan Hak $hak"
            }

            if (hak == 0){
                val gecis = Intent(this@OyunActivity2,SonucActivity2::class.java)
                gecis.putExtra("dogruSayi",randomSayi)
                startActivity(gecis)
            }
        }
    }
}