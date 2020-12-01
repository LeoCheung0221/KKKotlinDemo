package com.tufusi.kkkotlin.algorithms.sort

import java.util.*

/**
 * Created by LeoCheung on 2020/11/30.
 * @description 基数排序 又称 桶排序，是计数排序的升级版
 * 原理：利用函数的映射关系，
 *
 * Time Complexity： O(nk)
 * Space Complexity：O(n+k)
 */
class RadixSort {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var items = arrayOf(4, 1, 5, 3, 2)
            val sortItems = radixSort(items)
            sortItems.forEach { print("$it") }
            println()

            items = Array(200, { 0 }).mapIndexed { index, i -> index }.toTypedArray()
            val temp = items[5]
            items[5] = items[6]
            items[6] = temp

            val count = 10000
            val start = Date()
            for (i in 0 until count) {
                radixSort(items)
            }
            val milliseconds = Date().time - start.time
            println("耗时：$milliseconds")
        }

        private fun radixSort(arr: Array<Int>, cBase: Int = 10): Array<Int> {
            var result = arr.copyOf()
            val maxVal = arr.max()!!
            var i = 0

            while (Math.pow(cBase.toDouble(), i.toDouble()) <= maxVal) {
                result = bucketsToList(listToBuckets(result, cBase, i))
                i++
            }
            return result
        }

        private fun bucketsToList(buckets: Array<MutableList<Int>>): Array<Int> {
            val result = mutableListOf<Int>()

            for (bucket in buckets) {
                // add the number in a bucket sequentially to the returned array
                result.addAll(bucket)
            }

            return result.toTypedArray()
        }

        private fun listToBuckets(items: Array<Int>, cBase: Int, i: Int): Array<MutableList<Int>> {
            val buckets = Array(cBase, { mutableListOf<Int>() })

            val pBase = Math.pow(cBase.toDouble(), i.toDouble()).toInt()
            for (x in items) {
                // Isolate the base-digit from the number
                val digit = (x / pBase) % cBase
                // Drop the number into the correct bucket
                buckets[digit].add(x)
            }
            return buckets
        }
    }
}