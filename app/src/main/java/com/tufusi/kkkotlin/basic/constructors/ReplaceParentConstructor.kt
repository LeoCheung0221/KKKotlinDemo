package com.tufusi.kkkotlin.basic.constructors

/**
 * Created by LeoCheung on 2020/12/1.
 * @description 更换父构造函数
 */
class ReplaceParentConstructor {

    abstract class Man {
        public var name: String

        constructor(name: String) {
            this.name = name
        }
    }

    class Employee : Man {
        var position: String

        constructor(name: String) : super(name) {
            this.position = "CEO"
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val employee = Employee("LeoCheung")
            println(employee.position)
        }
    }
}