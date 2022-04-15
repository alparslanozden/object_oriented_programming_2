package com.alparslan.object_oriented_programming_2

fun main(){

    val k1 = Kisiler2(1,"Alparslan")
    val k2 = Kisiler2(2,"Ahmet")
    val k3 = Kisiler2(3, "Özden")

    val kisilerArray = ArrayList<Kisiler2>()

    kisilerArray.add(k1)
    kisilerArray.add(k2)
    kisilerArray.add(k3)

    println("İlk Liste:")
    for (k in kisilerArray){
        println("${k.kisiNo} - ${k.kisiAd}")
    }


    println("Sayısal Sıralanmış Liste:")
    val sayisalKisilerArray = kisilerArray.sortedWith(compareBy { it.kisiNo })

    for (k in sayisalKisilerArray){
        println("${k.kisiNo} - ${k.kisiAd}")
    }

    println("Sayısal Tersten Sıralanmış Liste:")
    val tersSayisalKisilerArray = kisilerArray.sortedWith(compareByDescending { it.kisiNo }  )

    for (k in tersSayisalKisilerArray){
        println("${k.kisiNo} - ${k.kisiAd}")
    }


    println("Harfsel Büyüklükle Sıralanmış Liste:")
    val harfKisilerArray = kisilerArray.sortedWith(compareByDescending { it.kisiAd })

    for (k in harfKisilerArray){
        println("${k.kisiNo} - ${k.kisiAd}")
    }

}