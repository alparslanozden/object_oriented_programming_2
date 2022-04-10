package com.alparslan.object_oriented_programming_2

class Mudur:Personel() {

    fun iseAl(p:Personel){
        p.iseAlindi()
    }

    fun terfiEttir(p:Personel){

    /*    if(p is Ogretmen){                      // TYPE CONTROL
            p.maasArttir()
        }

        if(p is Isci){
            println("İşçiler terfi alamaz")
        }
    */
        (p as Ogretmen).maasArttir()             // CASTİNG
    }
}