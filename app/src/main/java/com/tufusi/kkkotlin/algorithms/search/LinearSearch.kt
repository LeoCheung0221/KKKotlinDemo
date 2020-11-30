package com.tufusi.kkkotlin.algorithms.search

import java.util.*

/**
 * Created by LeoCheung on 2020/11/30.
 * @description 线性搜索
 * 原理：依次遍历数据集合，当查询值等于遍历项，即可返回对应位置索引
 */
class LinearSearch {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var items = listOf(2, 3, 5, 7, 11, 13, 17)
            println(linear_search(items, 1))  // print -1
            println(linear_search(items, 7))  // print 3
            println(linear_search(items, 19)) // print -1

            items = Array(1000000, { 0 }).mapIndexed { index, i -> index }
            val count = 100
            val start = Date()
            for (i in 0 until count ) {
                linear_search(items, 777777)
            }
            val milliseconds = Date().time - start.time
            println("耗时：$milliseconds")
        }

        private fun linear_search(list: List<Int>, x: Int): Int {
            var i = 0
            var count = list.size
            while (i < count) {
                if (list[i] == x) {
                    return i
                }
                i++
            }
            return -1
        }
    }

}