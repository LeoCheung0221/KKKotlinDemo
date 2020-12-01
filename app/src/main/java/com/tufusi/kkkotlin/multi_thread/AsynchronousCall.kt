package com.tufusi.kkkotlin.multi_thread

/**
 * Created by LeoCheung on 2020/12/1.
 * @description 异步委托调用
 */
class AsynchronousCall {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val i = 5
            val action = {
                Thread.sleep(3_000)
                println(i * 10)
            }

            // Run lambda at new thread
            val thread = Thread(action)
            thread.start()
        }
    }

}