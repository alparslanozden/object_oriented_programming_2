package com.alparslan.object_oriented_programming_2

import java.util.*
import kotlin.collections.ArrayList

fun main(){

    val girdi = Scanner(System.`in`)
    val dersNotlari = ArrayList<DersNotlar>()

    while (true){
        println("Dersin Adını Giriniz: ")
        val ders = girdi.next()
        println("Ders Notunu Giriniz: ")
        val not = girdi.nextInt()
        val yeniNot = DersNotlar(ders,not)

        println("Çıkmak için(1) - Devam etmek için diğer sayılar: ")
        val cikis = girdi.nextInt()

            if (cikis == 1){
                println("Çıkış Yapıldı")
                break
            }
    }

}