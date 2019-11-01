package com.ngocthanhnguyen.kotlinprogramming.oriented_object

fun main() {
    /*
    val employee = Employee("Thanh")
    println(employee.firstName)
    println(employee.fullTime)

    var employee2 = Employee2()
    println(employee2.firstName)
    employee2.firstName = "Thanh"
    println(employee2.fullTime)
    */

    var car = Car("blue", "toyota", 2015)
    println(car)

    var car1 = Car("blue", "toyota", 2015)
    println(car == car1)

    var car2 = car.copy()
    println(car2)
    println(car == car2)

    var car3 = car.copy(year = 2016, color = "green")
    println(car3)

    var car4 = Car()
    println(car4)
}

private class Employee (val firstName: String = "", var fullTime: Boolean = true){}

private class Employee1(val fisrtName: String) {

    var fullTime = true

    constructor(firstName: String, fullTime: Boolean): this(firstName) {
        this.fullTime = fullTime
    }
}

private class Employee2 {

    var firstName = ""
    get() {
        println("Running the custom get")
        return field
    }
    set(value) {
        println("Running the custom set")
        field = value
    }

    var fullTime = true

}

data class Car(val color: String = "", val model: String = "", val year: Int = 0) {}