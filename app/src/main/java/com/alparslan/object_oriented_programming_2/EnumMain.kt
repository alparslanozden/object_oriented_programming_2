package com.alparslan.object_oriented_programming_2

fun main(){

    fun ucretAl(boyut:KonserveBoyut){

        when(boyut){
            KonserveBoyut.Kucuk -> println(20*30)
            KonserveBoyut.Orta -> println(30*30)
            KonserveBoyut.Buyuk -> println(40*30)
        }
    }

        ucretAl(KonserveBoyut.Buyuk)
}