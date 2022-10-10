package com.gyugyu.kotlin.chap3

fun swap(s: String, from: Int, to: Int): String {
    val chars = s.toCharArray()
    val tmp = chars[from]
    chars[from] = chars[to]
    chars[to] = tmp
    return chars.concatToString()
}

fun main() {
    println(swap("Hello", 1, 2))
    println(swap("Hello", from = 1, to = 2))
    println(swap("Hello", to = 3, from = 0))
    println(swap("Hello", 1, to = 3))
    println(swap(from = 1, s = "Hello", to = 2))
    println(swap(s = "Hello", 1, 2))
    println(swap(s = "Hello", 1, to = 2))
}