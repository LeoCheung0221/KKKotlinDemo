package com.tufusi.kkkotlin.basic.inheritance

/**
 * Created by LeoCheung on 2020/12/2.
 * @description 兼容性检查 is
 */
class CompatibilityCheckIs {

    open class Shape {}
    open class Square : Shape()
    open class RedSquare : Shape()

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val square = Square()
            val isShape = square is Shape
            println("是否是同类型：$isShape")

            val isRedSquare = square is RedSquare
            println("是否是同类型：$isRedSquare")
        }
    }
}