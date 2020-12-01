package com.tufusi.kkkotlin.multi_thread

/**
 * Created by LeoCheung on 2020/11/30.
 * @description
 */
class ThreadTaskObject {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val thread = MyThread()
            thread.start()
        }
    }

    class MyThread : Thread() {
        override fun run() {
            // task implementation
            print("in my thread")
        }
    }


}