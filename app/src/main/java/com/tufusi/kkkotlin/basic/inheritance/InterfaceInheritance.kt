package com.tufusi.kkkotlin.basic.inheritance

/**
 * Created by LeoCheung on 2020/12/2.
 * @description 接口继承
 */
class InterfaceInheritance {

    interface IShae {
        var lineCount: Int
        fun getArea(): Int
    }

    class Square : IShae {

        override var lineCount: Int
        private var sideLength: Int

        constructor(sideLength: Int) {
            this.sideLength = sideLength
            this.lineCount = 4
        }

        override fun getArea(): Int {
            return sideLength * sideLength
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val square = Square(6)
            var area = square.getArea()
            println(area)
        }
    }
}