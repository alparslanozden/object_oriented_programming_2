package com.alparslan.object_oriented_programming_2.paket2

import com.alparslan.object_oriented_programming_2.paket1.A

class B : A(){

    fun fonksiyon(){
        val nesne = A()
        println(nesne.varsayilanDegisken)
        println(nesne.internalDegisken)
        println(nesne.publicDegisken)
        println(protectedDegisken)


    }
}