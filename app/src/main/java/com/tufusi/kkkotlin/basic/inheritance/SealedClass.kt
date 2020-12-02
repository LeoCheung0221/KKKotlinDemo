package com.tufusi.kkkotlin.basic.inheritance

/**
 * Created by LeoCheung on 2020/12/2.
 * @description 密封类
 */
class SealedClass {

    open class Shape {}
    class Square : Shape() {} // 除非对外open, 默认都是final
//    class RedSquare : Square() {} // ERROR

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

        }
    }
}