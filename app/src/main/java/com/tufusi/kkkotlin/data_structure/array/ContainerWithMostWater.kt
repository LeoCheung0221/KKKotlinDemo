package com.tufusi.kkkotlin.data_structure.array

/**
 * Created by LeoCheung on 2020/12/4.
 * @description
 */
class ContainerWithMostWater {

    class Solution {
        fun maxArea(height: IntArray): Int {
            var max = 0
            var start = 0 // 左边界
            var end = height.size - 1 // 右边界

            while (start < end) {
                var width = end - start
                // 初始化高度为左边界对应高度值
                var high = height[start]
                if (height[start] < height[end]){
                    high = height[start]
                    start++
                }else{
                    high = height[end]
                    end --
                }

                val temp = width * high
                if (temp > max){
                    max = temp
                }
            }
            return max
        }
    }
}