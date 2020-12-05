package com.tufusi.kkkotlin.syntactic_sugar.methods_funs

/**
 * Created by LeoCheung on 2020/12/1.
 * @description 可选的参数值
 */
class OptionalParamsValues {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            sayGoodBye()
            sayGoodBye("see you")
        }

        private fun sayGoodBye(message: String = "GoodBye!") {
            println(message)
        }
    }
}