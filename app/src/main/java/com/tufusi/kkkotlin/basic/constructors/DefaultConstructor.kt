package com.tufusi.kkkotlin.basic.constructors

/**
 * Created by LeoCheung on 2020/12/1.
 * @description
 */
class DefaultConstructor {

    class Man {
        var name = ""
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val man = Man()

        }
    }
}