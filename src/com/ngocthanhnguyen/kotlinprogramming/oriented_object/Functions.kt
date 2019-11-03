package com.ngocthanhnguyen.kotlinprogramming.oriented_object

fun main() {
    /*
    println(multiplyLabel(3, 4, "The result is:"))
    println(multiplyLabel(label = "The result is:", operand1 = 3, operand2 = 4))

    val employee = Employee3("Thanh")
    println(employee.upperCaseFirstName())

    val car1 = Car1()
    val car2 = Car1()
    val car3 = Car1()

    printColor(car1, car2, car3)
    printColor("Some Car's colors:", car1, car2, car3)
    printColor(car1, car2, car3, str = "Some Car's colors:")

    val cars = arrayOf(car1, car2, car3)
    printColor(*cars)*/

    println(Utils().upperFirstAndLast("ngoc-Thanh NGUYEn"))
    println("ngoc-Thanh NGUYEn".upperFirstAndLast())
}

fun multiplyLabel(operand1: Int, operand2: Int, label: String): String {
    return "$label ${operand1 * operand2}"
}

fun multiplyLabel1(operand1: Int, operand2: Int, label: String) = "$label ${operand1 * operand2}"

fun printColor(vararg cars: Car1) {
    for (car in cars) {
        println(car.color)
    }
}

fun printColor(str: String, vararg cars: Car1) {
    println(str)
    for (car in cars) {
        println(car.color)
    }
}

fun printColor(vararg cars: Car1, str: String) {
    println(str)
    for (car in cars) {
        println(car.color)
    }
}

class Employee3(var firstName: String = "") {
    fun upperCaseFirstName() = firstName.toUpperCase()
}

data class Car1(val color: String = "black", val model: String = "Mercedes", val year: Int = 1991) {}