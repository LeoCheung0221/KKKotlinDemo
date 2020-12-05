package com.tufusi.kkkotlin.syntactic_sugar.methods_funs

/**
 * Created by LeoCheung on 2020/12/1.
 * @description In/Out参数
 */
class InOutParams {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var s1 = arrayOf("A")
            var s2 = arrayOf("B")

            swapStrings(s1, s2)

            println(s1[0])
            println(s2[0])
        }

        private fun swapStrings(s1: Array<String>, s2: Array<String>) {
            val temp = s2[0]
            s2[0] = s1[0]
            s1[0] = temp
        }
    }
}