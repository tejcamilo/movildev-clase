package com.example.aplicacionprueba

// comentario en linea

/*
* Comentario multilinea
* */

class Introduccion {

    fun intro() {

        val nombreUsuario: String = "Ana"
        var edadUsuario: Int = 20
        var name: String? = null

        println("Nombre: $nombreUsuario, Edad: $edadUsuario")
        println("$nombreUsuario.length: ${nombreUsuario.length}")
        edadUsuario = 25
        println("La nueva edad es: $edadUsuario")

        print("Ingrese su edad:")
        edadUsuario = readln().toInt()

        var producto :Int = 2.times(4)

        if (true) {
            println("true")
        } else if (false) {
            println("false")
        } else {
            println("none")
        }

        var num: Int = 5

        if (num in (1..10)) {
            println("$num dentro del rango")
        }

        when (num) { // switch case equivalent
            0 -> print("Valor cero")
            in 1..10 -> println("Dentro del rango")
            else -> println("Fuera del rango")
        }
    }
}

fun main() {
    println("Ingrese el total de la cuenta")
    //var totalCuenta = readln()?.toDoubleOrNull()
    println("Ingrese el porcentaje de la propina")
    //var porcentaje = readln()?.toDoubleOrNull() ?: println("Dato inválido")


}