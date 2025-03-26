package com.example.aplicacionprueba.ui.theme

import kotlin.math.pow

fun main() {
    print("Ingrese el valor de x: ")
    val x = readLine()?.toDouble()

    print("Ingrese el valor de y: ")
    val y = readLine()?.toDouble()

    if (x != null && y != null) {
        println("Suma: ${x+y}")
        println("Resta: ${x-y}")
        println("Multiplicación: ${x*y}")
        println("Potencia x^y: ${x.pow(y)}")
        println("Raiz x: ${x.pow(0.5)}")
        println("Raiz y: ${y.pow(0.5)}")
    }
}

