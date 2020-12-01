package com.tufusi.kkkotlin.basic.properties

/**
 * Created by LeoCheung on 2020/12/1.
 * @description
 */
class ReadOnlyProperties {

    // 存储性能
    class FilmList() {
        val count: Int = 10
    }

    // 计算属性
    class Circle(val radius: Double) {
        val area: Double
            get() = 2 * Math.PI * radius
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var filmList = FilmList()
            var count = filmList.count

            println("count: $count")
            println()

            val circle = Circle(2.0)
            println(circle.area)
        }
    }

}