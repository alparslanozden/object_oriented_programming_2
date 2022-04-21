package com.alparslan.object_oriented_programming_2

import java.util.*
import kotlin.collections.ArrayList

fun main(){

    val girdi = Scanner(System.`in`)
    var sayac = 1
    val ogrenciler = ArrayList<Ogrenci>()

    while (true){
        println("Öğrenci adını giriniz: ")
        val ad = girdi.next()

        println("Öğrenci sınıfını giriniz: ")
        val sinif = girdi.next()

        val yeniOgrenci = Ogrenci(sayac,ad,sinif)
        sayac = sayac + 1
        ogrenciler.add(yeniOgrenci)

        println("Çıkmak için (1) - Devam etmek için diğer sayılar")
        val cikis = girdi.nextInt()

        if (cikis == 1){

            for (ogrenci in ogrenciler){
                println("**************")
                println("Öğrenci Numarası: ${ogrenci.no}")
                println("Öğrenci Adı: ${ogrenci.ad}")
                println("Öğrenci Sınıfı: ${ogrenci.sinif}")
            }

            println("Çıkış Yapıldı")
            break
        }

    }

}