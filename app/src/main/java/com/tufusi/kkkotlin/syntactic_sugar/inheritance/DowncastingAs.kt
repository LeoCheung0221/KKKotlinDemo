package com.tufusi.kkkotlin.syntactic_sugar.inheritance

/**
 * Created by LeoCheung on 2020/12/2.
 * @description 约化为（as）
 */
class DowncastingAs {

    open class Shape {}
    open class Square : Shape()
    open class RedSquare : Shape()

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val square = Square()
            val shape = square as Shape  // shape is Shape
            val redSquare = square as? RedSquare // redSquare is null
        }
    }
}