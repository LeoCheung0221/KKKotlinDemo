package com.tufusi.kkkotlin.syntactic_sugar.reference_equality

/**
 * Created by LeoCheung on 2020/12/2.
 * @description 检查引用相等
 */
class Check4ReferenceEquality {

    class Car() {

    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val car1 = Car()
            val car2 = Car()
            val car3 = car1

            val equal1 = car1 == car2 // false
            val equal2 = car1 == car3 // true

            println(equal1)
            println(equal2)
        }
    }

}