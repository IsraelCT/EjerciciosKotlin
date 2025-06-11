package com.example.ejercicioskotlin.Ejercicios

/*
    Invertir cadenas (leerlas de derecha a izquierda,
 en lugar de de izquierda a derecha) es una tarea sorprendentemente común en programación.

Su tarea es invertir una cadena dada.

Algunos ejemplos:

Convertirse "stressed"en "desserts".
Convertirse "strops"en "sports".
Convertirse "racecar"en "racecar".
 bv
Por ejemplo, en bioinformática, invertir la secuencia de cadenas de
 ADN o ARN suele ser importante para diversos análisis, como encontrar
 cadenas complementarias o identificar secuencias palindrómicas que tienen
  importancia biológica.
 */


fun main(){

    println(reverseString("Hola"))
}

fun reverseString(word : String) : String {
    return word.lowercase().reversed()

}