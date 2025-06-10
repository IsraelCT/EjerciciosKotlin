package com.example.ejercicioskotlin.Ejercicios



/*
Introducción
Bob es un adolescente despreocupado . Le gusta creerse genial. Y definitivamente no se emociona con nada. Eso no sería genial.

Cuando la gente habla con él, sus respuestas son bastante limitadas.

Instrucciones
Tu tarea es determinar qué le responderá Bob a alguien cuando le diga algo o le haga una pregunta.

Bob sólo responde una de cinco cosas:

"Claro." Esta es su respuesta si le preguntas algo como "¿Cómo estás?". La convención para las preguntas es terminar con un signo de interrogación.
"¡Tranquilo!". Esta es su respuesta si le gritas. La convención para gritar es TODO EN MAYÚSCULAS.
"¡Tranquilo, sé lo que hago!" Esto es lo que dice si le gritas una pregunta.
"¡Bien! ¡Así!" Así responde al silencio. La convención para el silencio es nada, o varias combinaciones de espacios en blanco.
"Lo que sea." Esto es lo que responde a cualquier otra cosa.

 */
//Nota
// La función de Kotlin trim proporciona una forma práctica de eliminar espacios iniciales y finales de las cadenas en el desarrollo de Android.
//El .endsWith()método compara el final de la secuencia con el sufijo dado y devuelve un valor booleano que indica si son iguales o no.
fun main() {
    println(hey("ADSDS"))
}

fun hey(word: String) : String {
    val msg = word.trim()
    if (msg.isEmpty()) return "Bien asi"


    val isQueston = msg.endsWith('?')
    val isYelling = ('A' ..'Z').any(){
        msg.contains(it)}  && msg == msg.uppercase()
    if (isYelling) return  if (isQueston) "Se lo que hago" else  " No me grites"
    else return if (isQueston) "Claro" else "Como sea!"

}
