package com.tufusi.kkkotlin.basic.inheritance

/**
 * Created by LeoCheung on 2020/12/2.
 * @description 受保护的类成员
 */
class ProtectedClassMembers {

    open class Shape {
        protected var lineCount: Int = 0
    }

    class Square : Shape() {
        init {
            lineCount = 4
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val square = Square()
//            val lineCount = square.lineCount // ERROR
        }
    }
}