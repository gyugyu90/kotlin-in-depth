package com.gyugyu.kotlin.chap3

fun printSorted(vararg items: Int) {
    items.sort()
    println(items.contentToString())
}

fun main() {
    printSorted(6, 2, 10, 1) // [1, 2, 6, 10]

    val numbers = intArrayOf(4, 5, 3, 1)
    printSorted(*numbers) // spread operator, 얕은 복사를 한다.
}