package com.tufusi.kkkotlin.basic.subscripts

/**
 * Created by LeoCheung on 2020/12/2.
 * @description
 */
class WithOneParameter {

    class PowerOfTwo {
        operator fun get(i: Int): Int {
            return Math.pow(2.0, i.toDouble()).toInt()
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val power = PowerOfTwo()
            val p2 = power[2]
            val p8 = power[8]
            val p16 = power[16]

            println(p2)
            println(p8)
            println(p16)
        }
    }
}