package com.tufusi.kkkotlin.syntactic_sugar.methods_funs

/**
 * Created by LeoCheung on 2020/12/1.
 * @description 参数数组
 */
class ArrayOfParams {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var avg = GetAvg(1.0, 2.0, 3.0, 4.0)
            println(avg)
        }

        fun GetAvg(vararg values: Double): Double {
            if (values.isEmpty()) {
                return 0.0
            }
            var sum = 0.0
            for (value in values) {
                sum += value
            }
            return sum / values.size
        }
    }
}