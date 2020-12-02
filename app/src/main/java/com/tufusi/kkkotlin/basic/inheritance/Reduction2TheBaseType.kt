package com.tufusi.kkkotlin.basic.inheritance

/**
 * Created by LeoCheung on 2020/12/2.
 * @description 约简到基本类型
 */
class Reduction2TheBaseType {

    open class Shape {
        open val name: String
            get() = "Shape"
    }

    class Square : Shape() {
        override val name: String
            get() = "Square"
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var square = Square()

            // 隐式方法
            val shape1: Shape = square
            // 显式第一个方法
            val shape2 = square as Shape
            // 显式第二个方法
            val shape3 = square as? Shape

            var name1 = shape1.name
            var name2 = shape2.name
            var name3 = shape3?.name
            println("$name1")
            println("$name2")
            println("$name3")
        }
    }
}