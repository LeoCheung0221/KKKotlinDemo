package com.tufusi.kkkotlin.syntactic_sugar.constructors

/**
 * Created by LeoCheung on 2020/12/1.
 * @description
 */
class CallOwnConstructor {

    class Man {
        var name: String = ""
        var country: String = ""

        constructor(name: String) {
            this.name = name
        }

        constructor(name: String, country: String) {
            this.name = name
            this.country = country
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var man = Man("Leo", "Vicky")
            var man1 = Man("LeoCheung")
        }
    }
}