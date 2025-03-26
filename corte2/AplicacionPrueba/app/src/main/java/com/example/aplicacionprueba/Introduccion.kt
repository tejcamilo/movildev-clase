package com.example.aplicacionprueba

import android.util.Log
import androidx.compose.animation.core.spring

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
    /*
    println("Ingrese el total de la cuenta:")
    val totalCuenta = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    println("Ingrese el porcentaje de la propina:")
    val porcentaje = readlnOrNull()?.toIntOrNull() ?: 0

    val propina = totalCuenta * (porcentaje.toDouble() / 100)
    val total = totalCuenta + propina

    println("Propina: $propina")
    println("El total a pagar es: $total")
    println("Propina: $propina")
    println("El total a pagar es: $total")
    */

    /* Condiciones y ciclos */
    println("Ingrese la edad del usuario")
    val edad = readln().toIntOrNull()
    if (edad != null) {
        validarEdad(edad)
    } else {
        println("Ingrese un dato válido")
    }

}

fun validarEdad(edad: Int) {
    if (edad >= 18) {
        Log.d("Condicionales", "El usuario es mayor de edad")
        println("El usuario es mayor de edad")
    } else {
        println("El usuario es menor de edad")
    }
}

fun clasificarEdad(edad: Int) {
    when {
        edad in 0 .. 12 -> println("Niño")
        edad in 13 .. 17 -> println("Adolescente")
        edad in 18 .. 60 -> println("Adulto")
        else -> println("Datos inválidos")
    }
}