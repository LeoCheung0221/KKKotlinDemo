package com.tufusi.kkkotlin.syntactic_sugar.constructors

/**
 * Created by LeoCheung on 2020/12/1.
 * @description 调用父类构造函数
 */
class CallParentConstructor {

//    // first method
//    abstract class Man(var name: String)
//
//    class Employee(
//        var position: String,
//        name: String
//    ) : CallParentConstructor.Man(name)

    // second method
    abstract class Man {
        public var name: String

        constructor(name: String) {
            this.name = name
        }
    }

    class Employee : Man {
        var position: String

        constructor(name: String, position: String) : super(name) {
            this.position = position
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val employee = Employee("Leo", "Vicky")
            println(employee.name)
            println(employee.position)
        }
    }
}