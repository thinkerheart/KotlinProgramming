package com.ngocthanhnguyen.kotlinprogramming.lambda_collection_generic

fun main() {
    val _employees = listOf(Employee("Ngoc-Thanh", "NGUYEN", 2009),
        Employee("Ngoc Thuy Trang", "NGUYEN", 2009)
    )

    //neu lambda expression la tham so cuoi cung cua function (minBy function in this case) -> co the viet lambda ngoai dau ngoac don, va neu function chi co 1 tham so -> thi co the bo luon cap dau ngoac don cua function
    println(_employees.minBy { employee -> employee._startYear })
    println(_employees.minBy { it._startYear })
    println(_employees.minBy ( Employee::_startYear ))

    //lambda expression can access local variable declared before, not need be a FINAL variable such as in Java
    var _num = 5
    run {
        _num += 5
        println(_num)
    }

    run(::topLevel)
}

fun countTo100(): String {
    val _numbers = StringBuilder()
    return with(_numbers) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }
}

fun countTo100MoreConcise(): String = with(StringBuilder()) {
    for (i in 1..99) {
        append(i)
        append(", ")
    }
    append(100)
    toString()
}

fun countTo100ApplyFunction(): String = StringBuilder().apply {
    for (i in 1..99) {
        append(i)
        append(", ")
    }
    append(100)
}.toString()

//lambda can access function parameter
fun useParameter(_employees: ArrayList<Employee>, _num: Int) {
    _employees.forEach {
        println(it._firstName)
        println(_num)
    }
}

fun topLevel() = println("This is a top level function")

data class Employee(val _firstName: String, val _lastName:String, val _startYear: Int){}