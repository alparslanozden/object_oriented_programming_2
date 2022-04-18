package com.alparslan.object_oriented_programming_2

fun main(){

    val sayilar = ArrayList<Int>()

    sayilar.add(45)
    sayilar.add(41)
    sayilar.add(22)
    sayilar.add(100)
    sayilar.add(37)
    sayilar.add(10)
    sayilar.add(290)

    val tekler = ArrayList<Int>()
    val ciftler = ArrayList<Int>()

    for (s in sayilar){
        val sonuc = s % 2

    if(sonuc == 0){
        ciftler.add(s)
    }
    if (sonuc == 1){
        tekler.add(s)
    }
    }
    println("Tekler: ")
    for (t in tekler){
        println(t)
    }

    println("Çiftler: ")
    for (c in ciftler){
        println(c)
    }

}