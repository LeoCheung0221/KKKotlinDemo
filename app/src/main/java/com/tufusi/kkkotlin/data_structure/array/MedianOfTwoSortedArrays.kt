package com.tufusi.kkkotlin.data_structure.array

/**
 * Created by LeoCheung on 2020/12/4.
 * @description
 */
class MedianOfTwoSortedArrays {

    class Solution {
        fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
            var len1 = nums1.size
            var len2 = nums2.size
            var lenSum = len1 + len2
            var median: Double
            // 如果加起来是奇数，取最中间那一位
            if (lenSum % 2 == 1) {
                var mid = lenSum / 2 // 取整
                median = getPointElement(nums1, nums2, mid + 1)
            } else { // 偶数，将中间两位取平均
                var midL = lenSum / 2 - 1
                var midR = lenSum / 2
                var medianL = getPointElement(nums1, nums2, midL + 1)
                var medianR = getPointElement(nums1, nums2, midR + 1)
                median = (medianL + medianR) / 2
            }
            return median
        }

        private fun getPointElement(nums1: IntArray, nums2: IntArray, k: Int): Double {
            var len1 = nums1.size
            var len2 = nums2.size
            var index1 = 0
            var index2 = 0
            var kElement = k

            while (true) {
                // 处理边界
                if (len1 == index1) {
                    return nums2[kElement - 1 + index2].toDouble()
                }
                if (len2 == index2) {
                    return nums1[kElement - 1 + index1].toDouble()
                }
                // 俩数组不断排除，最后均只有一个元素，取最小值
                if (kElement == 1) {
                    return Math.min(nums1[index1], nums2[index2]).toDouble()
                }

                // 数组均有元素
                var half = kElement / 2
                var newIndex1 = Math.min(index1 + half, len1) - 1
                var newIndex2 = Math.min(index2 + half, len2) - 1
                var baseLine1 = nums1[newIndex1]
                var baseLine2 = nums2[newIndex2]
                if (baseLine1 <= baseLine2) {
                    kElement -= (newIndex1 - index1 + 1)
                    index1 = newIndex1 + 1
                }else{
                    kElement -= (newIndex2 - index2 + 1)
                    index2 = newIndex2 + 1
                }
            }
        }
    }
}