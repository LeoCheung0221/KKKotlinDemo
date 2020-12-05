package com.tufusi.kkkotlin.basic.multi_thread

/**
 * Created by LeoCheung on 2020/12/1.
 * @description 开启等待线程
 */
class StartNewWaitThread {

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
            // wait until thread is terminated
            thread.join()
            // 线程执行完回调
            println("main thread")
        }
    }
}