package com.tufusi.kkkotlin.syntactic_sugar.inheritance

/**
 * Created by LeoCheung on 2020/12/2.
 * @description 私有类成员
 */
class PrivateClassMembers {

    open class Shape {
        private var uid = 0

        companion object {
            private var maxUID = 0
        }

        fun GetUID(): Int {
            return uid
        }

        init {
            uid = ++maxUID
        }
    }

    class Square : Shape() {
        init {
//            uid++ // ERROR 私有类成员无法访问
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val square = Square()
            var uid = square.GetUID()
            println("$uid")

//            uid = square.uid // ERROR
        }
    }
}