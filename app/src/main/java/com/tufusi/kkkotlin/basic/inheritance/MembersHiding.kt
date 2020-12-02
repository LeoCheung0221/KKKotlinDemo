package com.tufusi.kkkotlin.basic.inheritance

/**
 * Created by LeoCheung on 2020/12/2.
 * @description 成员隐藏
 */
class MembersHiding {

    open class Shape {
        open fun fill(color: String) {
            println("Fill implementation")
        }
    }

    class Square : Shape() {
        override fun fill(color: String) {
            println("New fill implementation")
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var square = Square()
            square.fill("RED")

            var shape = Shape()
            shape.fill("YELLOW")
        }
    }
}