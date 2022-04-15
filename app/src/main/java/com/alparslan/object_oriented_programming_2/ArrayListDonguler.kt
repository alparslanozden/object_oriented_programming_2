package com.alparslan.object_oriented_programming_2

fun main(){

    val meyveler = ArrayList<String>()

    meyveler.add("Elma")
    meyveler.add("Armut")
    meyveler.add("Portakal")
    meyveler.add("Kivi")
    meyveler.add("Mandalina")

    for (meyve in meyveler){
        println("Sonuç: $meyve")
    }
    for ((indeks, meyve) in meyveler.withIndex()){
        println("Sonuç 2: $indeks : $meyve")
    }


}