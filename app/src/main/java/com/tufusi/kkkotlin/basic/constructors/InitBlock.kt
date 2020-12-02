package com.tufusi.kkkotlin.basic.constructors

/**
 * Created by LeoCheung on 2020/12/1.
 * @description Initialization block
 */
class InitBlock {

    class Man {
        var id = 0

        // 初始化代码块
        companion object {
            var nextId: Int

            init {
                nextId = getLastDbId()
            }

            private fun getLastDbId(): Int {
                // some implementation
                return 0
            }
        }

        init {
            nextId++
            id = nextId
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val man = Man()
            println(man.id)
        }
    }
}