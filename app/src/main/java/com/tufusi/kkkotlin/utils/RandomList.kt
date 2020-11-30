package com.tufusi.kkkotlin.utils

import java.util.*
import kotlin.collections.ArrayList

/**
 * Created by LeoCheung on 2020/11/30.
 * @description 打乱集合顺序
 */
class RandomList {

    companion object {
        @JvmStatic
        fun <T> randomList(arr: ArrayList<T>): ArrayList<T> {
            val random = Random()
            val result: ArrayList<T> = ArrayList()
            while (arr.size > 0) {
                val randIndex: Int = random.nextInt(arr.size)
                result.add(arr.removeAt(randIndex))
            }
            return result
        }
    }
}