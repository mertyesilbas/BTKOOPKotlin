package com.example.btkoopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("------ SINIFLAR ------")
        val kullanici = Kullanici("Mert", 23)
        val digerKullanici = Kullanici("Yeşilbaş", 19)

        println("------ ENCAPSULATION ------")
        val ahmet = Sanatci("Ahmet", 22, "Müzisyen")
        println(ahmet.isim)
        println(ahmet.yas)
        println(ahmet.meslek)
        ahmet.meslek = "Gitarist"
        println(ahmet.meslek)
    }
}