package com.example.aplicacionprueba.ui.theme

fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun multiplicar(a: Int, b: Int) = a*b

fun saludar(nombre: String = "Camilo") {
    println("Hola $nombre")
}

// funciones lambda o anónimas

var suma = {a:Int, b : Int -> a+b}

fun main() {
    sumar(1,1)
    multiplicar(2,2)
    saludar()
    saludar("Tú")
    suma(2,3)
}