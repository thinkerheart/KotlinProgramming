package com.ngocthanhnguyen.oriented_object

//import com.ngocthanhnguyen.kotlinprogramming.oriented_object.SomeClass
import com.ngocthanhnguyen.kotlinprogramming.oriented_object.topLevelFunction
import com.ngocthanhnguyen.kotlinprogramming.oriented_object.CompanyCommunication as CC

fun main() {
    println(topLevelFunction())
    println(CC.getCopyrightLine())

    //error: because SomeClasse has access modifier "internal" --> just in same module
    //println(SomeClass.accessPrivateVar())
}