package com.tufusi.kkkotlin.basic.subscripts

/**
 * Created by LeoCheung on 2020/12/2.
 * @description 索引方法
 */
class WithGenericParameter {

    class Country(var info: Map<String, Any>) {
        operator fun <T> get(key: String): T? {
            return info[key] as T?
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val china = Country(
                mapOf(
                    "Name" to "China",
                    "Population" to 14_000_000_000
                )
            )

            val name: String? = china["Name"]
            val population: Long? = china["Population"]

            println(name)
            println(population)
        }
    }
}