package com.tufusi.kkkotlin.basic.methods_funs

/**
 * Created by LeoCheung on 2020/12/1.
 * @description 么有任何返回值
 */
class WithoutAnyReturnValue {

    class Counter {
        var count = 0

        fun incBy(value: Int) {
            count += value
        }

        fun incBy(value: Int, amount: Int) {
            count += value * amount
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var counter = Counter()
            counter.incBy(3)

            counter.incBy(3, 5)
            println(counter.count)
        }
    }
}