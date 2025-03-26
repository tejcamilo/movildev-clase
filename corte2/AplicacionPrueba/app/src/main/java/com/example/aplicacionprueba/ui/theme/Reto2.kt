package com.example.aplicacionprueba.ui.theme

fun main() {
    print("Ingrese el peso del bebé: ")
    val peso = readLine()?.toDouble()

    print("Ingrese la edad en meses: ")
    val meses = readLine()?.toInt()

    var dosisVacuna = ((peso?.plus(10))?.div((meses?.times(10)!!)))?.times(8)

    /**
     * Using null checks suggested by chatgpt
     * if (peso != null && meses != null) {
     *     val dosisVacuna = ((peso + 10) / (meses * 10)) * 8
     *     println("La dosis de la vacuna es: $dosisVacuna")
     * } else {
     *     println("Error: Ingrese valores válidos.")
     * }
     */


    println("La dosis de la vacuna es: $dosisVacuna")
}

