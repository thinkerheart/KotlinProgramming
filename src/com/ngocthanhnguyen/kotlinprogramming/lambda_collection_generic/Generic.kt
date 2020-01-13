package com.ngocthanhnguyen.kotlinprogramming.lambda_collection_generic

fun <T> printCollection(collection: List<T>) {
    collection.forEach {
        println(it)
    }
}

fun <T : Number> convertToInt(collection: List<T>) {
    collection.forEach {
        println("${it.toInt()}")
    }
}

fun <T> append(item1: T, item2: T)
    where T: CharSequence, T: Appendable {
    println("Result is ${item1.append(item2)}")
}

inline fun <reified T> getElementsOfType(listAny: List<Any>): List<T> {
    val newList: MutableList<T> = mutableListOf()
    listAny.forEach {
        if (it is T) newList.add(it)
    }
    return newList
}