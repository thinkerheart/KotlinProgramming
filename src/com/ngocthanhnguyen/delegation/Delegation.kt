package com.ngocthanhnguyen.delegation

import kotlin.properties.Delegates

val heavy by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
    println("ONCE")
    "I am lazy"
}

lateinit var str: String

var myStr: String by Delegates.observable("Initial value") { 
    property, oldValue, newValue -> println("Property ${property.name} changed value from $oldValue to $newValue")
}

var classA: ClassA by Delegates.observable(ClassA("Initial value")) {
    property, oldValue, newValue -> println("Property ${property.name} changed value from $oldValue to $newValue")
}

fun main() {
    println(heavy)
    println(heavy)
    println(str) //exception: not be initialized
    myStr = "Change value"
    myStr = "Change value again"
    classA.str = "Change value"
    classA = ClassA("Second value")
}

data class ClassA(var str: String)