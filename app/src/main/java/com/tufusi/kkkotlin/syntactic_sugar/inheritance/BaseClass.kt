package com.tufusi.kkkotlin.syntactic_sugar.inheritance

/**
 * Created by LeoCheung on 2020/12/2.
 * @description 基类
 */
class BaseClass {

    // 第一种写法
//    abstract class Shape(var lineCount: Int)
//    class Square(var sideLength: Int) : Shape(4)

    // 第二种写法
    abstract class Shape {
        public var lineCount: Int

        constructor(lineCount: Int) {
            this.lineCount = lineCount
        }
    }
    class Square : Shape {
        var sideLength: Int

        constructor(sideLength: Int) : super(4) {
            this.sideLength = sideLength
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var square = Square(5)
            println(square.lineCount)
        }
    }
}