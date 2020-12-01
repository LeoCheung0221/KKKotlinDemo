package com.tufusi.kkkotlin.multi_thread

import android.os.Build
import androidx.annotation.RequiresApi

/**
 * Created by LeoCheung on 2020/12/1.
 * @description
 */
class ParallelStream {

    companion object {
        @RequiresApi(Build.VERSION_CODES.N)
        @JvmStatic
        fun main(args: Array<String>) {
            val rows = arrayOf(2, 3, 5, 7, 11, 13, 17)

            // 原始顺序
            rows.asList()
                .stream()
                .forEach { i -> showNumber(i) } // 顺序流会受线程数影响，单一线程执行会一次休眠500ms按序打印

            // 打乱顺序
            rows.asList()
                // 一个并行执行的流，通过默认的ForkJoinPool实现，可以提高多线程任务的执行速度
                .parallelStream()
                // 原始顺序
//                .collect(Collectors.toList())
                .forEach { i -> showNumber(i) } // 并行流不受线程影响，多线程并发执行，随缘打印

            // 还原顺序
            rows.asList()
                .parallelStream()
                .sorted()
                .forEachOrdered { i -> showNumber(i) }
        }

        private fun showNumber(number: Int?) {
            Thread.sleep(500)
            print("$number, ")
        }
    }

}