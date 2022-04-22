package com.alparslan.object_oriented_programming_2

import java.util.Scanner
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
        dersNotlari.add(yeniNot)

        println("Çıkmak için(1) - Devam etmek için diğer sayılar: ")
        val cikis = girdi.nextInt()

            if (cikis == 1){
                println("***************")
                var toplam = 0

                for (dn in dersNotlari){
                    println("${dn.ders} : ${dn.not}")
                    toplam = toplam + dn.not
                }
                val ortalama = toplam / dersNotlari.size

                println("Ortalama: $ortalama")

                if (ortalama>=50){
                    println("GEÇTİ")
                }else{
                    println("KALDI")
                }
                println("Çıkış Yapıldı ve Kaydedildi")
                break
            }

    }

}