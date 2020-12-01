package com.tufusi.kkkotlin.multi_thread

/**
 * Created by LeoCheung on 2020/12/1.
 * @description
 */
class StartNewThread {

    class AddThread : Thread() {
        private fun add(a: Int, b: Int): Int {
            sleep(3_000)
            return a + b
        }

        public override fun run() {
            val result = add(3, 5)
            println("result: $result")
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val thread = AddThread()
            thread.priority = Thread.MIN_PRIORITY
            thread.start()
            println("main thread")
        }
    }

}