package com.tufusi.kkkotlin.syntactic_sugar.nestedclass

/**
 * Created by LeoCheung on 2020/12/1.
 * @description 内部类需要加 inner 关键字
 */
class NestedClass {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val someClass = SomeClass()
            someClass.InnerClass().showValue()
        }
    }
}

class SomeClass {
    val value = 13

    class NestedClass {
        fun showValue() {
            // ERROR：unresolved reference: value
//            println("value = $value")
        }
    }

    inner class InnerClass {
        fun showValue() {
            println("value = $value")
        }
    }
}
