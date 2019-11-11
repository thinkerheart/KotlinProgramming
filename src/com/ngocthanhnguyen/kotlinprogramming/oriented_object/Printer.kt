package com.ngocthanhnguyen.kotlinprogramming.oriented_object

fun main() {
    val _laserPrinter = LaserPrinter("HP-ENVY-4502")
    _laserPrinter.printModel()
}

abstract class Printer(val _modelName: String) {
    abstract fun printModel()
    open fun printModel1() = println("The model of this printer is $_modelName")
    abstract fun bestSellingPrice(): Double
 }

open class LaserPrinter(_modelName: String) : Printer(_modelName) {
    override fun bestSellingPrice(): Double = 129.99
    final override fun printModel() = println("The model of this laser printer is $_modelName")
    override fun printModel1() = println("The model of this laser printer is $_modelName")
}

class SpecialLaserPrinter(_modelName: String) : LaserPrinter(_modelName) {
    // override fun printModel() = println("The model of this special laser printer is $_modelName")
}

interface IMyInterface {
    val _number: Int
    val _number1: Int
        get() = 10
}

class SomethingClass(override val _number: Int) : IMyInterface

class SomethingClass1 : IMyInterface {
    override val _number: Int
        get() = 125

}