package com.tufusi.kkkotlin.algorithms.search

import java.util.*

/**
 * Created by LeoCheung on 2020/11/30.
 * @description 快速搜索
 */
class FastLinearSearch {

    companion object {
        @JvmStatic
        fun main(arg: Array<String>) {
            var items = mutableListOf(2, 3, 5, 7, 13, 19, 24)
            println(fls_search(items, 1))  // print -1
            println(fls_search(items, 7))  // print 3
            println(fls_search(items, 24)) // print 6

            /* 同样测试性能 */
            items = Array(1000000, { 0 }).mapIndexed { index, _ -> index }.toMutableList()
            val count = 100
            val start = Date()
            for (i in 0 until count) {
                fls_search(items, 777777)
            }
            val milliseconds = Date().time - start.time
            println("耗时：$milliseconds")
        }

        private fun fls_search(list: MutableList<Int>, x: Int): Int {
            var i = 0
            var count = list.size
            list.add(x)

            while (true) {
                if (list[i] == x) {
                    // 边界考虑
                    if (i < count) {
                        return i
                    }
                    return -1
                }
                i++
            }
            // 不管找没找到，移除之
            list.removeAt(count)
        }
    }

}