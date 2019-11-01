package com.ngocthanhnguyen.kotlinprogramming.basic_difference_kotlin_java

fun main() {

    val _hello1: String = "Hello"

    val _hello2: String = "Hello"

    println("hello1 is referentially equal to hello2: ${_hello1 === _hello2}")

    println("hello1 is structurally equal to hello2: ${_hello1 == _hello2}")

    println("hello1 is structurally equal to hello2: ${_hello1.equals(_hello2)}")

    var _num1: Int = 2988

    val _any: Any = "the any type is the root of the Kotlin class hierarchy"

    if (_any is String) {

        println(_any.toUpperCase())

    }

    println("""   1
        |  11
        | 111
        |1111""".trimMargin())

}