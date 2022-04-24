package com.alparslan.object_oriented_programming_2

import java.util.*


fun main(){

    val girdi = Scanner(System.`in`)
    val personeller = ArrayList<Personel2>()

    for (i in 1..5){
        println("$i.Personel Ad:")
        val isim = girdi.next()

        println("$i.Personel Adres İl: ")
        val il = girdi.next()

        println("$i.Personel İlçe: ")
        val ilce = girdi.next()

        val adres = Adres(il,ilce)
        val personel = Personel2(i,isim,adres)

        personeller.add(personel)
    }

    for (p in personeller){
        println("**************")
        println("Personel No: ${p.no}")
        println("Personel Ad: ${p.isim}")
        println("Personel İl: ${p.adres.il}")
        println("Personel İlçe: ${p.adres.ilce}")
    }

}