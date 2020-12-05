package com.tufusi.kkkotlin.syntactic_sugar.inheritance

/**
 * Created by LeoCheung on 2020/12/2.
 * @description 属性重新定义
 */
class PropertyOverride {

    open class Shape {
        open val lineCount: Int
            get() = 0
    }

    class Square : Shape() {
        override val lineCount: Int
            get() = 4
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val square = Square()
            println(square.lineCount)
        }
    }
}