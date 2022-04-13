package com.alparslan.object_oriented_programming_2

fun main(){

    val meyveler = ArrayList<String>()

    meyveler.add("Elma")
    meyveler.add("Armut")
    meyveler.add("Portakal")
    meyveler.add("Kivi")
    meyveler.add("Mandalina")

    println(meyveler.isEmpty())             // BOŞ MU

    println(meyveler.count())               // LİSTİN BOYUTU
    println(meyveler.size)                  // LİSTİN BOYUTU

    println(meyveler.first())               // İLK ELEMAN
    println(meyveler.last())                // SON ELEMAN

    println(meyveler.contains("Elma"))      // İSTENEN VERİ VAR MI?

    println(meyveler.sort())                // HARF VEYA SAYIYA GÖRE SIRALAR
    println(meyveler.toString())

    println(meyveler.reverse())             // TERS ÇEVİRİR
    println(meyveler.toString())

    meyveler.removeAt(3)               // SEÇİLEN İNDEXİ SİL
    println(meyveler.toString())

    meyveler.clear()                        // HEPSİNİ SİLER
    println(meyveler.toString())

}