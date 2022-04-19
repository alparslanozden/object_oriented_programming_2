package com.alparslan.object_oriented_programming_2

import java.util.*
import kotlin.collections.ArrayList

fun main(){

    val scanner = Scanner(System.`in`)

    val isimler = ArrayList<String>()

    isimler.add("ahmet")
    isimler.add("alparslan")
    isimler.add("özden")
    isimler.add("ülkü")
    isimler.add("kılıç")
    isimler.add("hamdi")

    println("Aramak için isim giriniz: ")
    val isim = scanner.next()

    for (i in isimler){
        if (i == isim)
            println("İsim Mevcut")
        break
    }

}