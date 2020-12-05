package com.tufusi.kkkotlin.syntactic_sugar.type_members

/**
 * Created by LeoCheung on 2020/12/2
 * @description 类型成员
 */
class TypeMembers {

    class Config {
        companion object {

            // type constant
            val maxConnections = 4

            // type fields
            var host = ""
            var port = 8888

            // type method
            fun getConnection(): String {
                return "$host:$port"
            }

            // type constructor
            init {
                host = "192.168.1.1"
            }
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val connection1 = Config.getConnection()

            Config.host = "192.168.2.2"
            val connection2 = Config.getConnection()

            println(connection1)
            println(connection2)
        }
    }
}