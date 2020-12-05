package com.tufusi.kkkotlin.syntactic_sugar.inheritance

/**
 * Created by LeoCheung on 2020/12/2.
 * @description 抽象类
 */
class AbstractClasses {

    abstract class Shape {
        var color = ""

        abstract fun fill(color: String)

        fun draw() {
            println(color)
        }
    }

    class Square : Shape() {

        override fun fill(color: String) {
            this.color = color
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
//            var shape = Shape() // ERROR 抽象类型不支持实例化
            var square = Square()
            square.fill("RED")
            square.draw()
        }
    }
}