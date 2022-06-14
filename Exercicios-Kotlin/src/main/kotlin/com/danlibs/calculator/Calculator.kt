package com.danlibs.calculator

fun main() {
    println("==============================")
    println("--------  CALCULATOR ---------")
    println("==============================")

    print("First value: ")
    var number1: Float
    number1 = testValue()
    print("Second value: ")
    var number2: Float
    number2 = testValue()
    var option: Int? = 99
    do {
        println("What do you want to do?")
        println("1 - Addition")
        println("2 - Subtraction")
        println("3 - Multiplication")
        println("4 - Division")
        println("5 - Change values")
        println("0 - Quit")
        do {
            try {
                option = readLine()?.toInt()
            } catch (e: NumberFormatException) {
                println("Invalid option!")
            }
        } while (option == null)
        when (option) {
            1 -> {
                println(sum(number1, number2))
                pressToContinue()
            }
            2 -> {
                println(subtract(number1, number2))
                pressToContinue()
            }
            3 -> {
                println(multiply(number1, number2))
                pressToContinue()
            }
            4 -> {
                println(divide(number1, number2))
                pressToContinue()
            }
            5 -> {
                print("First value: ")
                number1 = testValue()
                print("Second value: ")
                number2 = testValue()
            }
            0 -> println("Ok, bye!")
            else -> println("Invalid option!")
        }
    } while (option != 0)
}

private fun testValue(): Float {
    var numberTemp: Float = 0F
    do {
        var success: Boolean = false
        try {
            numberTemp = readLine()?.toFloat() ?: 0F
            success = true
        } catch (e: NumberFormatException) {
            println("Invalid value!")
        }
    } while (!success)
    return numberTemp
}

fun sum(a: Float, b: Float): String {
    return "$a + $b = ${a + b}"
}

fun subtract(a: Float, b: Float): String {
    return "$a - $b = ${a - b}"
}

fun multiply(a: Float, b: Float): String {
    return "$a X $b = ${a * b}"
}

fun divide(a: Float, b: Float): String {
    return "$a / $b = ${a / b}"
}

private fun pressToContinue(): String? {
    println("Press RETURN to continue...")
    return readLine()
}




