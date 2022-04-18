package com.alparslan.object_oriented_programming_2

fun main(){

    val sayilar = ArrayList<Int>()

    sayilar.add(1)
    sayilar.add(2)
    sayilar.add(3)
    sayilar.add(4)
    sayilar.add(5)

    for((indeks,sayi) in sayilar.withIndex() ){             //Hem indexi hem sayıyı verir
        val sonuc = sayi*2
        sayilar[indeks] = sonuc
    }

    for (s in sayilar){
        println(s)
    }

}