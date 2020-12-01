package com.tufusi.kkkotlin.basic.methods_funs

/**
 * Created by LeoCheung on 2020/12/1.
 * @description 多个返回值
 */
class MultipleReturnValues {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var arr = arrayOf(2, 4, 6)
            val (first, last) = getFirstLast(arr)

            println(first)
            println(last)
        }

        private fun getFirstLast(arr: Array<Int>): Pair<Int, Int> {
            var first = -1
            var last = -1
            if (arr.isNotEmpty()) {
                first = arr[0]
                last = arr[arr.size - 1]
            }

            return Pair(first, last)
        }
    }
}