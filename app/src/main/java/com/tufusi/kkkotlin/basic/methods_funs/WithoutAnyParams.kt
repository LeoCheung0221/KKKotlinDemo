package com.tufusi.kkkotlin.basic.methods_funs

/**
 * Created by LeoCheung on 2020/12/1.
 * @description 不带任何参数
 */
class WithoutAnyParams {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            sayGoodBye()
        }

        private fun sayGoodBye() {
            println("GoodBye!")
        }
    }
}