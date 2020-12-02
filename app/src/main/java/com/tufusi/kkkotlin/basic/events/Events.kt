package com.tufusi.kkkotlin.basic.events

/**
 * Created by LeoCheung on 2020/12/2.
 * @description 活动
 */
class Events {

    // In kotlin there're no events type
    interface GameListener {
        fun gameStarted(name: String)
    }

    class Game(val name: String) {
        private val listeners = arrayListOf<GameListener>()

        fun addListener(listener: GameListener) {
            listeners.add(listener)
        }

        fun start() {
            for (listener in listeners) {
                listener.gameStarted(name)
            }
        }
    }

    class Statistic : GameListener {
        var startsCount = 0
        var lastGame = ""

        override fun gameStarted(name: String) {
            startsCount++
            lastGame = name
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val statistic = Statistic()
            val heroes = Game("Heroes")
            val doom = Game("Doom")

            // subscribe to events
            heroes.addListener(statistic)
            doom.addListener(statistic)

            doom.start()
            heroes.start()

            println(statistic.lastGame)
            println(statistic.startsCount)
        }
    }
}