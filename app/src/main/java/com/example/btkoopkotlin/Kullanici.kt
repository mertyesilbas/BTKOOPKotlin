package com.example.btkoopkotlin

class Kullanici : Insan{
    var isim: String? = null
    var yas: Int? = null

    constructor(isim: String, yas: Int){
        this.isim = isim
        this.yas = yas
        println("Constructor çağırıldı!")
    }
    
    init{
        println("İnit Çağırıldı.")
    }
}