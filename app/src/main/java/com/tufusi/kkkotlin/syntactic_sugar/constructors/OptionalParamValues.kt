package com.tufusi.kkkotlin.syntactic_sugar.constructors

/**
 * Created by LeoCheung on 2020/12/1.
 * @description
 */
class OptionalParamValues {

    class Man {
        var name: String
        var country: String

        constructor(name: String = "leocheung", country: String = "china") {
            this.name = name
            this.country = country
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val man1 = Man()
            println(man1.name)
            println(man1.country)

            val man2 = Man("wenwen")
            println(man2.name)
            println(man2.country)

            val man3 = Man("wenwen", "China.Guangdong")
            println(man3.name)
            println(man3.country)
        }
    }
}