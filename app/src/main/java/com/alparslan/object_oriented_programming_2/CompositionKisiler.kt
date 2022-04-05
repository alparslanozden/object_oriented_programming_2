package com.alparslan.object_oriented_programming_2

fun main(){

    val adres = Adres("Bursa","Osmangazi")
    val kisi = Kisiler1("Alparslan",18,adres)

    println("Kişi Adı: ${kisi.ad}")
    println("Kişi Yaşı: ${kisi.yas}")
    println("Kişi İl: ${kisi.adres.il}")
    println("Kişi İlçe: ${kisi.adres.ilce}")

}