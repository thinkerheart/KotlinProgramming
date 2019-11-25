package com.ngocthanhnguyen.kotlinprogramming.loop_if_when_try_catch

fun main() {
    val _range = 0..12
    val _range1 = 'a'..'z'
    val _range3 = 12.downTo(0)
    val _range4 = _range.step(3)
    val _range5 = _range.reversed()

    println(3 in _range)
    println('c' in _range1)

    for (i in _range) {
        println(i)
    }

    for (s in "Hello") {
        println(s)
    }

    for (i in 0..12 step 3) {
        println(i)
    }

    for (i in 12 downTo 0 step 3) {
        println(i)
    }
}