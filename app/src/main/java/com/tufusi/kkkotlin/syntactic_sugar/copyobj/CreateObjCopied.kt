package com.tufusi.kkkotlin.syntactic_sugar.copyobj

/**
 * Created by LeoCheung on 2020/12/1.
 * @description Create a copy of the obj
 */
class CreateObjCopied {

    class Shape(val lineCount: Int, val name: String) {
        fun copy(): Shape {
            return Shape(lineCount, name)
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val square = Shape(4, "Square")
            val squareCopy = square.copy()
            println(squareCopy.lineCount)
        }
    }
}