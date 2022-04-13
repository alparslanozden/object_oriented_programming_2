package com.alparslan.object_oriented_programming_2

fun main(){

    val liste = ArrayList<String>()        // OR // val liste:ArrayList<Int>()

    val meyveler = ArrayList<String>()

    meyveler.add("Çilek")
    meyveler.add("Karpuz")
    meyveler.add("Portakal")
    meyveler.add("Mandalina")
    meyveler.add("Muz")

    println(meyveler.toString())                  //VERİLERİ GÖRÜNTÜLEME

    val str = meyveler.get(2)                    // SEÇİLİ VERİYİ GÖRÜNTÜLEME
    println(str)

    val str1 = meyveler[4]
    println(str1)

    meyveler.add("Avokado")                      // VERİ EKLEME
    meyveler[2] = "Ananas"                       // VERİ ÜZERİNE YAZMA-DEĞİŞTİRME

    meyveler.add(2,"Kiraz")       //  VERİYİ SİLMEDEN SEÇİLİ İNDEXE EKLEYIP KAYDIRMA
    println(meyveler.toString())
}