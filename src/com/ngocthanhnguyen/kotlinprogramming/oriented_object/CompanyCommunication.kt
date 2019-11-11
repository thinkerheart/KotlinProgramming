package com.ngocthanhnguyen.kotlinprogramming.oriented_object

import java.time.Year

fun main() {
    println(CompanyCommunication.getCopyrightLine())
    println(SomeClass.accessPrivateVar())

    var _thisisMutable = 45

    wantsSomeInterface(object : SomeInterface {
        override fun mustImplement(_num: Int): String{
            _thisisMutable++
            return "This is from mustImplement: ${_num * 100}"
        }
    })

    println(_thisisMutable)
}

object CompanyCommunication {
    val _currentyear = Year.now().value
    fun getCopyrightLine() = "Copyright \u00A9 $_currentyear our company. All rights reserved."
}

class SomeClass {
    companion object {
        private var _privateVar = 6
        fun accessPrivateVar() = "I'm accessing privateVar: $_privateVar"
    }
}

interface SomeInterface {
    fun mustImplement(_num: Int): String
}

fun wantsSomeInterface(_si: SomeInterface) {
    println("Printing from wantsSomeInterface ${_si.mustImplement(22)}")
}