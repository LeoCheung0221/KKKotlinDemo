package com.tufusi.kkkotlin.basic.inheritance

/**
 * Created by LeoCheung on 2020/12/2.
 * @description 方法重载
 */
class MethodOverride {

    open class Shape {
        open fun getArea(): Int {
            return 1
        }
    }

    class Square(var sideLength: Int) : Shape() {
        override fun getArea(): Int {
            return sideLength * sideLength
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var square = Square(7)
            var area = square.getArea()
            println(area)
        }
    }
}