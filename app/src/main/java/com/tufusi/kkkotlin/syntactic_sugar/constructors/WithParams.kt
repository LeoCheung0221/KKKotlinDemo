package com.tufusi.kkkotlin.syntactic_sugar.constructors

/**
 * Created by LeoCheung on 2020/12/1.
 * @description
 */
class WithParams {

    class Man(var name: String)

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val man = Man("LeoCheung")
            println(man.name)
        }
    }
}