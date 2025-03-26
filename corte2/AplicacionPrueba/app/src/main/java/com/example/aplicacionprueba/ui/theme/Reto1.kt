package com.example.aplicacionprueba.ui.theme

fun fahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5 / 9
}

fun main() {
    print("Ingrese la temperatura en Fahrenheit: ")
    val input = readLine()

    if (input != null && input.isNotBlank()) {
        val fahrenheit = input.toDoubleOrNull()

        if (fahrenheit != null) {
            val celsius = fahrenheitToCelsius(fahrenheit)
            println("$fahrenheit°F es equivalente a %.2f°C".format(celsius))
        } else {
            println("Por favor, ingrese un número válido.")
        }
    } else {
        println("Entrada no válida.")
    }
}