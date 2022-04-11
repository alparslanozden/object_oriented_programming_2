package com.alparslan.object_oriented_programming_2

fun main(){

    val aslan = Aslan()
    val amasyaElmasi: Elma = AmasyaElmasi()

    val elma = Elma()
    val tavuk:Eatable = Tavuk()

    val nesneler = arrayOf(aslan,amasyaElmasi,elma,tavuk)

    for(nesne in nesneler){                  //superclass subclass
        if (nesne is Eatable){
            nesne.howToEat()
        }
        if (nesne is Squeezable){
            nesne.howToSqueeze()
        }
    }

}