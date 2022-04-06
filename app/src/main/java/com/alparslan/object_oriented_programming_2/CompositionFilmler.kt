package com.alparslan.object_oriented_programming_2

fun main(){

    val k1 = Kategoriler(1,"Bilim Kurgu")
    val k2 = Kategoriler(2,"Komedi")

    val y1 = Yonetmenler(1,"Alper Çağlar")
    val y2 = Yonetmenler(2,"Christopher Nolan")
    val y3 = Yonetmenler(3,"Tom Cruise")

    val f1= Filmler(1,"Börü",2018,k1,y1)

    println("Film ID: ${f1.film_id}")
    println("Film Adı: ${f1.film_ad}")
    println("Film Yılı: ${f1.film_yil}")
    println("Kategorisi: ${f1.kategori.kategori_ad}")
    println("Yönetmen: ${f1.yonetmen.yonetmen_ad}")
}