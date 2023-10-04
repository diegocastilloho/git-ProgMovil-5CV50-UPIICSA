/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
import kotlin.math.pow
const val PI = 3.1416f
const val PHI = 1.618f
fun main() {
    val radius = 4f
    val area = circleArea(radius)
println("El area del circulo es: $area")
                          
}
    fun circleArea(radius:Float): Float{
    return PI*radius.pow(2)
    
}
