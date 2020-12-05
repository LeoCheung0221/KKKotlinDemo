package com.tufusi.kkkotlin.syntactic_sugar.constants

/**
 * Created by LeoCheung on 2020/12/1.
 * @description
 */
class Constants {

    class Calendar {
        companion object {
            val months = 12
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val months = Calendar.months
            // months is 12
        }
    }
}