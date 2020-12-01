package com.tufusi.kkkotlin.algorithms.sort

import java.util.*

/**
 * Created by LeoCheung on 2020/11/30.
 * @description 快速排序
 * 原理：
 * 采用分治策略
 * 1）先从数列中取出一个数作为基准数
 * 2）分区过程，将比这个数大的数全部放到基准数右边，小于或者等于基准数的数全部放到左边
 * 3）再对左右区间重复第二步，直到各个区间只有一个数
 *
 * Time Complexity：from O(n log(n)) to O(n^2)
 * Space Complexity：O(log(n))
 */
class QuickSort {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var items = arrayOf(4, 1, 5, 3, 2)

            var sortItems = quickSort(items)
            sortItems.forEach { print("$it") }
            println()

            items = Array(200, { 0 }).mapIndexed { i, _ -> i }
                .toTypedArray()
            val temp = items[5]
            items[5] = items[6]
            items[6] = temp

            val count = 10000
            val start = Date()

            for (i in 0 until count) {
                quickSort(items)
            }

            val milliseconds = Date().time - start.time
            println("耗时：$milliseconds")
        }

        private fun quickSort(arr: Array<Int>): Array<Int> {
            var items = arr.copyOf()
            doSort(items, 0, items.size - 1)
            return items
        }

        private fun doSort(items: Array<Int>, first: Int, last: Int) {
            if (first >= last) {
                return
            }
            var i = first
            var j = last
            var x = items[(first + last) / 2]

            while (i < j) {
                while (items[i] < x) i++
                while (items[j] > x) j--
                if (i <= j) {
                    var temp = items[i]
                    items[i] = items[j]
                    items[j] = temp

                    i++
                    j--
                }
            }

            doSort(items, first, j)
            doSort(items, i, last)
        }
    }

}