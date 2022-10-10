package com.gyugyu.kotlin.chap3

import kotlin.math.PI

class Chap3Functions {

    // 식이 본문인 함수
    fun circleArea(radius: Double): Double = PI * radius * radius

    // 반환 값이 Double로 추론됨
    fun circleAreaTypeInferred(radius: Double) = PI * radius * radius

    fun circleAreaLambda(radius: Double) = { PI * radius * radius }



}