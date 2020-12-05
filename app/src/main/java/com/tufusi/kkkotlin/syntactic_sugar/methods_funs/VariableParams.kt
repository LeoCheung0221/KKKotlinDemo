package com.tufusi.kkkotlin.syntactic_sugar.methods_funs

/**
 * Created by LeoCheung on 2020/12/1.
 * @description 可变参数
 */
class VariableParams {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            printLog("打印日志")
        }

        private fun printLog(message: String) {
            if (message.length > 3) {
//                message = message.substring(0, 3) // ERROR
            }
            println(message)
        }
    }
}