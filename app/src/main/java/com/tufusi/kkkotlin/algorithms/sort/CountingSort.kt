package com.tufusi.kkkotlin.algorithms.sort

/**
 * Created by LeoCheung on 2020/11/30.
 * @description 计数排序
 * 原理：对于给定的输入序列中的每一个元素x，确定该序列中值小于x的元素的个数，从而得出输出序列
 * Time Complexity：O(n+k)
 * Space Complexity：O(k)
 */
class CountingSort {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var items = arrayOf(4, 1, 3, 5, 2)
            val sortItems = countingSort(items)
            sortItems.forEach { print("$it") }
            println()
        }

        private fun countingSort(arr: Array<Int>): Array<Int> {
            val items = Array(arr.size, { 0 })
            var max = Int.MIN_VALUE
            var min = Int.MAX_VALUE

            // 做好边界值处理，防止越界，找出集合中最大最小值
            for (x in arr) {
                if (x > max) max = x
                if (x < min) min = x
            }

            // 新建容器存储 counts = {0, 0, 0, 0, 0}
            var counts = Array(max - min + 1, { 0 })

            // 遍历待排序集合，集合中的每一位都减去最小值min，得到的位置索引值再++  变成 {1, 1, 1, 1, 1}
            for (x in arr) {
                counts[x - min]++
            }
            counts.forEach { print("$it") }
            println()

            var total = 0
            // 遍历索引位置 1-5，将counts={1, 1, 1, 1, 1} -> {0, 1, 2, 3, 4}，统计小于指定参考值的个数，从而得出排序序列
            for (i in min..max) {
                var oldCount = counts[i - min]
                counts[i - min] = total
                total += oldCount
            }
            counts.forEach { print("$it") }
            println()

            // counts 中的值索引全部排好序，接下来查找目标数据集指定位置索引的值即可
            for (x in arr) {
                items[counts[x - min]] = x
                counts[x - min]++
            }

            return items
        }
    }

}