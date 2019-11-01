package com.ngocthanhnguyen.kotlinprogramming.basic_difference_kotlin_java

typealias EmployeeSet = Set<Employee>

fun main() {
    val number = 25
    //val number = 26 //error
    val number1: Short = 25

    var number2: Int = 0
    number2 = 10
    number2 = 20

    val employee = Employee("Ngoc-Thanh NGUYEN", 28)
    employee.name = "Thanh"
    //employee.id = 10 //error
    //employee = Employee("Thanh", 29) //error

    val employees: EmployeeSet

    val names = arrayListOf("Thanh", "Thanh 1", "Thanh 2")
    println(names[1])

    val employee1 = Employee("Thanh 1", 1)
    val employee2 = Employee("Thanh 2", 2)
    val employee3 = Employee("Thanh 2", 2)

    println(employee1 === employee2)
    println(employee2 === employee3)
    println(employee1 == employee2)
    println(employee2 == employee3)

    val change = 4.22
    println("To show the value of change, we use $change$")
    println("To show the value of change, we use $$change")
    println("$change devided by $change is ${change/change}")

}

class Employee(var name: String, val id: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Employee) {
            return other.name == name && other.id == id
        }
        return false;
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + id
        return result
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }

}