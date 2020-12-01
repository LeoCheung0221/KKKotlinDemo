package com.tufusi.kkkotlin.basic.properties

/**
 * Created by LeoCheung on 2020/12/1.
 * @description
 */
class TypeProperties {

    class Lesson {
        companion object {
            var lessonsCount = 0
        }

        // 初始化一次计数就加1
        init {
            lessonsCount++
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val lesson1 = Lesson()
            // Lesson.lessonsCount is 1
            val lesson2 = Lesson()
            // Lesson.lessonsCount is 2
        }
    }
}