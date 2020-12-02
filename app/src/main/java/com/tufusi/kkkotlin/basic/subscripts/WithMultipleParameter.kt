package com.tufusi.kkkotlin.basic.subscripts

/**
 * Created by LeoCheung on 2020/12/2.
 * @description
 */
class WithMultipleParameter {

    class Car(var model: String, var year: Int, var price: Int)
    class ToyotaPrices {
        private var cars = mutableListOf<Car>()

        operator fun get(model: String, year: Int): Int {
            var car = findCar(model, year)
            if (car == null) {
                return 0
            }
            return car.price
        }

        operator fun set(model: String, year: Int, price: Int) {
            val car = findCar(model, year)
            if (car == null) {
                val newCar = Car(model, year, price)
                cars.add(newCar)
            } else {
                car.price = price
            }
        }

        private fun findCar(model: String, year: Int): Car? {
            for (car in cars) {
                if (car.model == model && car.year == year) {
                    return car
                }
            }
            return null
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val prices = ToyotaPrices()
            prices["Rush", 2012] = 16818
            prices["Land Cruiser", 2014] = 548988

            val priceRAV4 = prices["RAV4", 2015]
            val priceRush = prices["Rush", 2012]

            println(priceRAV4)
            println(priceRush)
        }
    }
}