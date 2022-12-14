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

        println("------INHERITANCE------")
        val sanatciAhmet = OzelSanatci("Ahmet",21,"Müzisyen")
        sanatciAhmet.sarkiSoyle()

        println("------POLYMORPHISM------")
        // Statik Polymoprhism
        val islemler = Islemler()
        println(islemler.carpma())
        println(islemler.carpma(2,3))
        println(islemler.carpma(2,3,4))
        // Dinamik Polymorphism
        val kopek = Kopek()
        kopek.sesCikar()
        val kopek2 = Hayvan()
        kopek2.sesCikar()
        kopek.kopekFonksiyonu()

        println("------ABSTRACTION & INTERFACE------")
        kullanici.insanFonksiyonu()
        var gitar = Gitar()
        gitar.marka = "Marka"
        gitar.elektro = true
        gitar.bilgi()
        println(gitar.oda)

        println("------LAMBDA Gösterimleri------")
        val yazdigimiYazdirLambda = {string: String -> println(string)}
        yazdigimiYazdirLambda("Test Lambda")
        val carpmaLambda = {a: Int,b: Int -> a*b}
        println(carpmaLambda(6,7))
        val carpmaLambda2 : (Int, Int) -> Int = {a,b->a*b}
        println(carpmaLambda2(6,9))
    }

    fun yazdigimiYazdir(string: String){
        println(string)
    }
}