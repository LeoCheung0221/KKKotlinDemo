package com.tufusi.kkkotlin.algorithms.sort

/**
 * Created by LeoCheung on 2020/11/30.
 * @description 合并排序
 * 原理：
 * Time Complexity：O(n log(n))
 * Space Complexity：O(n)
 */
class MergeSort {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var items = arrayOf(4, 1, 3, 5, 2)
            val sortItems = mergeSort(items)
            sortItems.forEach { print("$it") }
            println()
        }

        private fun mergeSort(arr: Array<Int>): Array<Int> {
            var items = arr.copyOf()
            doSort(items)
            return items
        }

        /**
         * 执行排序，不断的一分为二，直到最小单元的数组排序完成，再全部合并
         */
        private fun doSort(items: Array<Int>) {
            if (items.size == 1) {
                return
            }

            var leftHalf = items.size / 2
            var leftArr = items.copyOfRange(0, leftHalf)
            var rightArr = items.copyOfRange(leftHalf, items.size)

            // {4, 1} {3, 5, 2}
            // ==> left: {4} right:{1}  right: {3}{5, 2}
            // ==> left: {4} right:{1} left:{3} left:{5} right:{2}
            // ==> left: {4} left:{5} left:{3}            right:{1} right:{2}
            // merge：left compare right
            // left: {1， 4} left: {3} right: {2, 5}
            // left: {1， 4} right: {2, 3, 5}
            // {1, 2, 3, 4, 5}
            doSort(leftArr)
            doSort(rightArr)

            return merge(leftArr, rightArr, items)
        }

        private fun merge(leftArr: Array<Int>, rightArr: Array<Int>, result: Array<Int>) {
            var l = 0
            var r = 0
            var i = 0

            while (l < leftArr.size && r < rightArr.size) {
                // 如果左边的元素小于右边的元素
                if (leftArr[l] < rightArr[r]) {
                    // result 重新洗牌
                    result[i] = leftArr[l]
                    l++
                } else { // 反之
                    result[i] = rightArr[r]
                    r++
                }
                i++
            }

            for (j in l until leftArr.size) {
                result[i] = leftArr[j]
                i++
            }
            for (j in r until rightArr.size) {
                result[i] = rightArr[j]
                i++
            }
        }
    }
}