package com.alparslan.object_oriented_programming_2

import kotlin.random.Random

fun main(){

    val sayilar = ArrayList<Int>()

    for (i in 1..100){
        val rasgeleSayi = Random.nextInt(0,101)
    }

    sayilar.sort()

    for (s in sayilar){
        println(s)
    }

}