package com.tufusi.kkkotlin.syntactic_sugar.methods_funs

/**
 * Created by LeoCheung on 2020/12/1.
 * @description 有返回值
 */
class WithReturnValue {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val sum = getSum(6, 4)
            println("$sum")
        }

        private fun getSum(n1: Int, n2: Int): Int {
            return n1 + n2
        }
    }
}