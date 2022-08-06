package com.example.btkoopkotlin

class OzelSanatci(isim: String, yas: Int, meslek: String) : Sanatci(isim, yas, meslek) {
    fun sarkiSoyle(){
        println("Şarkı söyleniyor")
    }
}