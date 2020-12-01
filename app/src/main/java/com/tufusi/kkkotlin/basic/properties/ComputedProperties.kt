package com.tufusi.kkkotlin.basic.properties

import kotlin.math.sqrt

/**
 * Created by LeoCheung on 2020/12/1.
 * @description
 */
class ComputedProperties {

    class Square(var side: Double) {
        var area: Double
            get() = side * side
            set(value) {
                side = sqrt(value)
            }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var square = Square(2.0)
            println(square.area)

            square.area = 9.0
            println(square.side)
        }
    }
}