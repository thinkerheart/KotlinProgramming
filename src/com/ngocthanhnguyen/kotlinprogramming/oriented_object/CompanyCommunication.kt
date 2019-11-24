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

    println (EDepartment.IT.getDepartmentInfor())
}

object CompanyCommunication {
    val _currentyear = Year.now().value
    fun getCopyrightLine() = "Copyright \u00A9 $_currentyear our company. All rights reserved."
}

internal class SomeClass {
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

fun topLevelFunction() = "This is a top level function"

enum class EDepartment(val _fulleName: String, val _numOfEmployee: Int) {
    HR("Human Resource", 5),
    IT("Information Technology", 10),
    Sale("Sale", 20),
    Accounting("Accounting", 3);

    fun getDepartmentInfor() = "The $_fulleName department has $_numOfEmployee employees"
}