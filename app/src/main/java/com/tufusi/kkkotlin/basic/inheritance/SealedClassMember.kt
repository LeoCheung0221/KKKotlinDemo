package com.tufusi.kkkotlin.basic.inheritance

/**
 * Created by LeoCheung on 2020/12/2.
 * @description 密封类成员
 */
class SealedClassMember {

    open class Shape {
        open fun getArea(): Int {
            return 0
        }
    }

    open class Square(var sideLength: Int) : Shape() {
        override fun getArea(): Int {
            return sideLength * sideLength
        }
    }

//    open class RedSquare(var sideLength: Int) : Square(sideLength) {
//        override fun getArea(): Int {
//            // ERROR
//        }
//    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

        }
    }
}