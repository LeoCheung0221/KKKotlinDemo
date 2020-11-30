package com.tufusi.kkkotlin.algorithms.search

import java.util.*

/**
 * Created by LeoCheung on 2020/11/30.
 * @description 插值搜索
 * 原理：设置左右边界，
 */
class InterpolationSearch {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var items = listOf(2, 3, 5, 7, 9, 13, 15, 17, 25)
            println(interpolator_search(items, 1))  // print -1
            println(interpolator_search(items, 7))  // print 3
            println(interpolator_search(items, 19)) // print -1

            /* 简单测试算法性能 */
            items = Array(1000000, { 0 }).mapIndexed { index, _ -> index }
            val count = 100
            val start = Date()
            for (i in 0 until count ) {
                interpolator_search(items, 777777)
            }
            val milliseconds = Date().time - start.time
            println("耗时：$milliseconds")
        }

        private fun interpolator_search(list: List<Int>, x: Long): Int {
            var low = 0
            var high = list.size - 1

            // 当左边界值小于所查询值 && 右边界值大于查询值
            while ((list[low] < x) && x < (list[high])) {
                // 找出中间位置
                var mid =
                    (low + ((x - list[low]) * (high - low)) / (list[high] - list[low])).toInt()

                if (list[mid] < x) {
                    low = mid + 1
                } else if (list[mid] > x) {
                    high = mid - 1
                } else {
                    return mid
                }
            }
            // 处理边界情况
            if (list[low] == x.toInt()) {
                return low
            }
            if (list[high] == x.toInt()) {
                return high
            }
            return -1
        }
    }

}