package com.tufusi.kkkotlin.syntactic_sugar.properties

/**
 * Created by LeoCheung on 2020/12/1.
 * @description
 */
class StoredProperties {

    class Point1(var x: Int, var y: Int)

    class Point2() {
        var x: Double = 0.0
        var y: Double = 0.0
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var point1 = Point1(2, 5)
            var point2 = Point2()

            // x and y is 0.0 (before assigning)
            point2.x = 3.0
            point2.y = 8.0

            println(point1.x)
            println(point2.y)
        }
    }
}