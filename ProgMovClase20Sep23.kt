/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun main() {
    fun login(user: String, password: String): Boolean{
        fun validate(input: String): Boolean{
            if (input.isEmpty()){
                return false
            }
            return true
            
            
        }
        val userValidated = validate(user)
        val passValidated = validate(password)
    return userValidated && passValidated
                          
}
    val userValidated = login("Juanito", "Navaja") //utilizar la funcion login y guardar el resultado en una...
    println("Usuario loggeado? $userValidated")
    
    fun rectangleArea(base: Double= 20.0, height: Double= 30.0) : Double{
        return base*height;
    }
    //correr area rectangulo con los valores por defecto
    println("Area con valores por defecto: ${rectangleArea()}")
    
    //Area de rectangulo con base seteada y altura por defecto
    println("Area con altura por defecto: ${rectangleArea(10.0)}")
    
    //Area de rectangulo por defecto y altura seteada con named arguments
    println("Area con base por defecto :${rectangleArea(height = 10.0)}")
    
    //setear base y altura con named arguments
    println("Area con datos determinados con named arguments: ${rectangleArea(height = 2.0,base=3.5)}")
}
