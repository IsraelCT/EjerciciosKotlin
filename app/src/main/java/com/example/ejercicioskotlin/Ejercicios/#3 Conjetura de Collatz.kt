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

println(computeStepCount(10))
}

fun computeStepCount (number : Int) : Int{
    require(number >0){
        "Numeros positivos"
    }
    fun loop(number: Int,count : Int) :Int = when{
        number == 1 -> (count)
        number % 2 == 0 -> loop(number / 2 ,count + 1)
        else -> loop(1 + number * 3, count + 1)
    }
    return loop(number, 0 )
}




