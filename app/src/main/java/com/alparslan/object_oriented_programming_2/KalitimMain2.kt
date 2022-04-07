package com.alparslan.object_oriented_programming_2

fun main(){

    val topkapiSarayi = Saray(20,5)
    val bogazVilla = Villa(4,true)

    println("Topkapı Sarayı Özellikleri:")
    println("Pencere sayısı: ${topkapiSarayi.pencereSayisi}")
    println("Kule sayısı: ${topkapiSarayi.kuleSayisi}")

    println("----------------------------------------")

    println("Boğaz Villa Özellikleri:")
    println("Pencere sayısı: ${bogazVilla.pencereSayisi}")
    println("Garaj durumu: ${bogazVilla.garajVarMi}")

}