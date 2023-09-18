/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

import kotlin.math.pow
const val pi = 3.1416f
const val phi = 1.618f
const val px1: Float = 4.0f
const val py1: Float = 3.0f
const val px2: Float = -3.0f
const val py2: Float = -2.0f

fun calcularPendiente(): Float {
    val numerador = py2 - py1
    val denominador = px2 - px1

    if (denominador == 0.0f) {
        throw IllegalArgumentException("La pendiente es indefinida debido a la división por cero.")
    }

    return numerador / denominador
}


fun circleArea(radius:Float): Float{ 
    return pi*radius.pow(2)
   } 

fun getpi(): Float{
    return pi
    }


fun printphi(){
    println("El numero áureo vale $phi")
    }

fun main() {
   
    val radius=4f
    val area= circleArea(radius)
    println("El area del circulo es : $area")
    println(getpi())
    printphi()
    try {
        val pendiente = calcularPendiente()
        println("La pendiente entre los puntos es: $pendiente")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

   }
