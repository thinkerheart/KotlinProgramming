package com.ngocthanhnguyen.kotlinprogramming.data_type

import com.ngocthanhnguyen.javaprogramming.DummyClass
import java.math.BigDecimal

fun main() {

    /*
    val _myInt = 10
    var _myLong = 22L
    val _myLong1: Long = 22

    //Kotlon has no widen datatype automatically

    //In Java it is correct
    //int _myInt = 5;
    //long _myLong = 20L;
    //_myLong = _myInt;

    //But in Kotlin it's not automatic
    //_myLong = _myInt => error
    _myLong = _myInt.toLong()

    val _myByte: Byte = 111
    var _myShort: Short
    _myShort = _myByte.toShort()

    var _myDouble = 65.984
    println(_myDouble is Double)

    val _myFloat = 838.987f
    println(_myFloat is Float)

    _myDouble = _myFloat.toDouble()

    //In Java it work
    //char _myChar = 65;

    //But in Kotlin it is not work
    val _myChar = 65 //it is Int
    //val _myChar: Char = 65 //error

    val _myCharInt = 65
    println(_myCharInt.toChar())

    val _myBoolean = true

    val _vacationTime = false
    val _onVacation = DummyClass().isVacationTime(_vacationTime)
    println(_onVacation)
    */

    val _names = arrayOf("John", "Jame", "Jill", "Joe")
    val _longs1 = arrayOf<Long>(1, 2, 3, 4)
    val _longs2 = arrayOf(1L, 2L, 3L, 4L)
    val _longs3 = arrayOf(1, 2, 3, 4)

    println(_longs2 is Array<Long>)
    println(_longs3 is Array<Int>)

    val _longs4 = _longs3
    _longs4.set(3, 5)

    println("${_longs3.get(0)} ${_longs3.get(1)} ${_longs3.get(2)} ${_longs3.get(3)}")
    println("${_longs4.get(0)} ${_longs4.get(1)} ${_longs4.get(2)} ${_longs4.get(3)}")

    val _evenNumbers = Array(16) { i -> i * 2 }

    for (_item in _evenNumbers) {
        println(_item)
    }

    var _someArray: Array<Int>
    _someArray = arrayOf(1, 2, 3, 4)

    for (_num in _someArray) {
        println(_num)
    }

    _someArray = Array(6) { i -> i }

    for (_num in _someArray) {
        println(_num)
    }

    val _mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')

    for (_item in _mixedArray) {
        println(_item)
    }

    val _myIntArray = intArrayOf(3, 9, 7, 90)

    DummyClass().printNumbers(_myIntArray)

    DummyClass().printNumbers(_someArray.toIntArray())

    val _convertedIntArray = _myIntArray.toTypedArray()

    //var _array1: Array<Int>(5) //error
    var _array1: Array<Int>

    var _array2 = IntArray(5)

    for (_item in _array2) {
        println(_item)
    }

    var str: String? = "Not null"

    //str = str!!.toUpperCase()

    str = str?.toUpperCase()
    if (str != null) { str = str.toUpperCase() }

    var str1 = str ?: "This is the default value when str is null"
    if (str == null) {
        str1 = "This is the default value when str is null"
    } else {
        str1 = str
    }

    val something: Any = arrayOf(1, 2, 3, 4)
    val str2 = something as? String
    println(str2)

    str?.let { printText(it) }

    val nullableInts = arrayOfNulls<Int>(5)
}

fun printText(text: String) { println(text) }