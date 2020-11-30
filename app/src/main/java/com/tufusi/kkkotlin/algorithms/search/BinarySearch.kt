package com.tufusi.kkkotlin.algorithms.search

import java.util.*

/**
 * Created by LeoCheung on 2020/11/30.
 * @description 二分搜索
 */
class BinarySearch {

    companion object { // static module
        @JvmStatic
        fun main(arg: Array<String>) {
            // test
            var items = listOf(2, 3, 5, 7, 13, 17, 19, 21)

            // print
            println(binarySearch(items, 0))  // print -1
            println(binarySearch(items, 13)) // print 4
            println(binarySearch(items, 21)) // print 7

            /* 简单测试二分搜索算法性能 */
            items = Array(1000000, { 0 }).mapIndexed { i, _ -> i } // {0, 1, 2, ... , 999999}
            val count = 100
            val start = Date()
            for (i in 0 until count) {
                println("当前索引：$i")
                binarySearch(items, 777777)
            }
            val milliseconds = Date().time - start.time
            println("耗时：$milliseconds")
        }

        /**
         * 二分搜索  --- 是当数组已经排好序才适用
         * @param list 数字集合
         * @param x    需要查找的数字
         * @return     返回需查找数字的位置索引
         */
        private fun binarySearch(list: List<Int>, x: Int): Int {
            var i = 0;
            var j = list.size
            while (i != j) {
                val m = (i + j) / 2
                if (x == list[m])
                    return m
                if (x < list[m])
                    j = m
                else
                    i = m + 1
            }
            return -1
        }
    }
}