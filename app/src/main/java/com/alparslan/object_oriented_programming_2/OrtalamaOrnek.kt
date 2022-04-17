package com.alparslan.object_oriented_programming_2

fun main(){

    val sayilar = ArrayList<Int>()

    sayilar.add(30)
    sayilar.add(40)
    sayilar.add(60)
    sayilar.add(90)
    sayilar.add(110)
    sayilar.add(300)
    sayilar.add(500)

    var toplam = 0

    for (s in sayilar){
        toplam = toplam + s
    }

    println("Sayıların Ortalaması: ${toplam / sayilar.size }")

}