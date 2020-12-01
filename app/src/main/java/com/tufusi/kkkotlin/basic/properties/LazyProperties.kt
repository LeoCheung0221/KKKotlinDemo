package com.tufusi.kkkotlin.basic.properties

/**
 * Created by LeoCheung on 2020/12/1.
 * @description 延迟属性
 */
class LazyProperties {

    class FilmList {
        init {
            println("some long operation")
        }
    }

    class MediaPlayer {
        // 只有该属性被调用才会实例化
        val filmsList: FilmList by lazy {
            FilmList()
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val player = MediaPlayer()
            // filmsList field not yet been created
            // It will be created after call filmList property
            val filmList = player.filmsList
        }
    }
}