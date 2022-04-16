package com.alparslan.object_oriented_programming_2

fun main(){

    val o1 = Ogrenci(1,"Ahmet","11F")
    val o2 = Ogrenci(2,"Alparslan", "12F")
    val o3 = Ogrenci(3,"Fatma","10C")
    val o4 = Ogrenci(4,"Aybala","9E")
    val o5 = Ogrenci(5,"Çimen","10E")

    val ogrenciler = ArrayList<Ogrenci>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)
    ogrenciler.add(o5)

    val sonucListe = ogrenciler.filter { (it.ad).contains("a")}

    for (o in sonucListe){
        println("**************")
        println("Öğrenci No: ${o.no}")
        println("Öğrenci Adı: ${o.ad}")
        println("Öğrenci Sınıf: ${o.sinif}")
    }


}