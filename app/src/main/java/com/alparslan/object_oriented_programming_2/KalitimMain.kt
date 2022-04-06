package com.alparslan.object_oriented_programming_2

fun main(){

    val araba = Araba("Siyah","Otomatik","Sedan")

    println(araba.renk)
    println(araba.vites)
    println(araba.kasa)

    val honda = Honda("Beyaz","Otomatik","Sedan","City")
    println(honda.model)
    println(honda.vites)
    println(honda.renk)
}