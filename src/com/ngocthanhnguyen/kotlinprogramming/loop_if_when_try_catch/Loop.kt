package com.ngocthanhnguyen.kotlinprogramming.loop_if_when_try_catch

import java.math.BigDecimal

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}

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

    for (i in 1 until 10) {
        println(i)
    }

    val _s = "goodbye"
    for (i in _s.indices) {
        println(i)
    }

    val _seasons = arrayOf("spring", "summer", "fall", "winter")
    for (i in _seasons.indices) {
        println(_seasons[i])
        println("${_seasons[i]} is season number $i")
    }
    println("whatever" !in _seasons)

    _seasons.forEach { println(it) }
    _seasons.forEachIndexed { index, s -> println("$s is season number $index") }

    for (i in 1..3) {
        jloop@ for (j in 2..4) {
            for (k in 3..5) {
                println(k)
                break@jloop
            }
            println(j)
        }
        println(i)
    }

    //"if" in Kotlin can return a value
    val _isBool = if (1 < 2) true else false
    println(_isBool)

    val _isBoolean = if (1 < 2) {
        println("something")
        true
    } else {
        println("something else")
        false
    }
    println(_isBoolean)

    val _num = 100
    val _count = 99

    when (_num) {
        300, 600 -> println("600")
        in 600..800 -> println("800")
        _count + 1 -> println("6")
        200 -> println("200")
        else -> println("Doesn't match anything")
    }

    val _obj1: Any = BigDecimal(35.5)

    val _value = when (_obj1) {
        is String -> {
            println(_obj1.toUpperCase())
            1
        }
        is BigDecimal -> {
            println(_obj1.remainder(BigDecimal(10.5)))
            2
        }
        is Int -> {
            println("${_obj1 - 11}")
            3
        }
        else -> {
            println("something else")
            -1
        }
    }
    println(_value)

    val _season = Season.WINTER
    val _str = when (_season) {
        Season.SPRING -> "flowers"
        Season.SUMMER -> "hot!"
        Season.FALL -> "romantic!"
        Season.WINTER -> "cold!"
        //not need else because type of _season variable is enum and all possible value of enum is above
    }
    println(_str)

    //replace if, else if and else use
    val _num1 = 1
    val _num2 = 2
    when {
        _num1 < _num2 -> println("_num1 < _num2")
        _num1 > _num2 -> println("_num1 > _num2")
        else -> println("_num1 = _num2")
    }

}

//can use "try catch" like an expression such as "if" and "when"
fun getNumber(_str: String): Int {
    return try {
        Integer.parseInt(_str)
    } catch (_e: NumberFormatException) {
        0
    } finally {
        println("Clean resource")
    }
}

fun notImplementedYet(something: String): Nothing {
    throw IllegalArgumentException("Implement me!")
}