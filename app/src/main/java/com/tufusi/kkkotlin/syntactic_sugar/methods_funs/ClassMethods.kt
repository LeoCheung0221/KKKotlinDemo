package com.tufusi.kkkotlin.syntactic_sugar.methods_funs

/**
 * Created by LeoCheung on 2020/12/1.
 * @description 类方法 其实就是类里面的静态方法
 */
class ClassMethods {

    class Calc {
        companion object {
            fun getMin(vararg values: Int): Int {
                if (values.isEmpty()) {
                    return 0
                }

                var min = values[0]
                for (i in 1 until values.size) {
                    if (values[i] < min) {
                        min = values[i]
                    }
                }
                return min
            }
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val min = Calc.getMin(3, 2, 5, 1, 4)
            println("min: $min")
        }
    }
}