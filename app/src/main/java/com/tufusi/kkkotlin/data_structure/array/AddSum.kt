package com.tufusi.kkkotlin.data_structure.array

/**
 * Created by LeoCheung on 2020/12/4.
 * @description
 */
class AddSum {

    class Solution {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            val hashMap = hashMapOf<Int, Int>()
            for (i in nums.indices) {
                if (hashMap.containsKey(target - nums[i])) {
                    return intArrayOf(hashMap[target - nums[i]]!!, i)
                }
                hashMap[nums[i]] = i
            }
            return intArrayOf(0)
        }
    }
}