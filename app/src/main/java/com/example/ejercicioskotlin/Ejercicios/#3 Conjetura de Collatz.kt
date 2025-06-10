package com.example.ejercicioskotlin.Ejercicios

/*
La función generateSequence en Kotlin se utiliza para crear secuencias perezosas (lazy), que generan elementos bajo demanda. Es especialmente útil para:

Secuencias infinitas (como números, Fibonacci, etc.).

Generación eficiente (solo calcula elementos cuando se necesitan).

Evitar cálculos redundantes en colecciones grandes.

Condiciones de terminación definidas por el usuario.
 */

/*
Ejercicio :
Una noche, te topaste con un viejo cuaderno lleno de garabatos crípticos, como si alguien hubiera estado obsesionado con una idea.
 En una página, destacaba una sola pregunta: ¿ Puede cada número llegar al 1? Estaba relacionada con la Conjetura de Collatz ,
  un enigma que ha desconcertado a los pensadores durante décadas.

Las reglas eran engañosamente simples. Elige cualquier número entero positivo.

Si es par, divídelo por 2.
Si es impar, multiplícalo por 3 y súmale 1.
 */

fun main (){

}

fun collatz(num : Int) : Int{
    require(num > 0){
        "Numero positivo"
    }


}