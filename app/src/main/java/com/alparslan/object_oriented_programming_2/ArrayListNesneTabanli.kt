package com.alparslan.object_oriented_programming_2

fun main(){

    val u1 = Urun(1,"Saat",150.0)
    val u2 = Urun(2,"TV", 1500.0)
    val u3 = Urun(3,"Bilgisayar",2000.0)

    val urunler = ArrayList<Urun>()

    urunler.add(u1)
    urunler.add(u2)
    urunler.add(u3)

    for (urun in urunler){
        println("------------")
        println("Ürün no: ${urun.urunNo}")
        println("Ürün adı: ${urun.urunAd}")
        println("Ürün fiyatı: ${urun.urunFiyat}")
    }

}