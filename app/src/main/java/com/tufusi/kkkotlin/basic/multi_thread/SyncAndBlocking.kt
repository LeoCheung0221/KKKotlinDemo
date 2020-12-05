package com.tufusi.kkkotlin.basic.multi_thread

import java.util.concurrent.Executors

/**
 * Created by LeoCheung on 2020/12/1.
 * @description 同步与阻塞
 */
class SyncAndBlocking {

    companion object {

        private val lock = Object()

        @JvmStatic
        fun main(args: Array<String>) {
            val threadPool = Executors.newFixedThreadPool(10)

            // start ten threads
            for (i in 1..10) {
                val action = Runnable {
                    showNumber(i)
                }
                threadPool.execute(action)
            }
            threadPool.shutdown()
        }

        private fun showNumber(number: Int) {
            // 控制锁实现同步与阻塞
            synchronized(lock){
                Thread.sleep((1..500).random().toLong())
                print("$number, ")
            }
        }
    }

}