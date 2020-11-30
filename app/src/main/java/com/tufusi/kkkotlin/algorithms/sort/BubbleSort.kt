package com.tufusi.kkkotlin.algorithms.sort

import com.tufusi.kkkotlin.utils.RandomList
import java.util.*
import kotlin.collections.ArrayList

/**
 * Created by LeoCheung on 2020/11/30.
 * @description 冒泡排序
 * 原理：假设按从小到大排序，从位置1开始依次遍历其后的所有数据，比较二者大小，如果位置1处的数大于后面的某一个数，则交换位置，否则继续执行
 * 然后从位置2处开始，循环往复比较，得到最终排序集合
 *
 * Time Complexity：O(n^2)
 * Space Complexity：O(1)
 */
class BubbleSort {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var items = arrayListOf<Int>(4, 1, 5, 3, 2)

            val sortItems = bubbleSort(items)
            sortItems.forEach { print("$it") }
            println()

            /* 测试冒泡排序性能 */
            var itemsArr = Array(200, { 0 }).mapIndexed { index, i -> index }.toTypedArray().toList() as ArrayList<Int>
            items = RandomList.randomList(itemsArr)
//            items.forEach { print("$it, ") }

            val count = 10000
            val start = Date()
            for (i in 0 until count) {
                bubbleSort(items)
            }
            val milliseconds = Date().time - start.time
            println("耗时：$milliseconds")
        }

        private fun bubbleSort(arr: ArrayList<Int>): ArrayList<Int> {
            val items = arr
            for (i in items.indices) {
                for (j in i + 1 until items.size) {
                    if (items[j] < items[i]) {
                        val temp = items[j]
                        items[j] = items[i]
                        items[i] = temp
                    }
                }
            }
            return items
        }
    }

}