class Mario(var vidas: Int = 3) {
    init {
        println("It's a me! Mario!") //vamos a hacer que mario se presente a construirlo
    }

    private var state = "small" //mario es pequeño al iniciar el juego
    private var lives = 3 //uno empiexa el juego con tres vidas

        set(value) {
            if (field == 1) { //si teniamos una vida, se termina el juego
                field = 0
                gameOver()
            } else if (field == 0) { //si ya teniamos 0 vidas, no haz reinciado el juego
                println("Necesitas volver a jugar")
            } else {
                field = value //podemos asignar el valor correctamente
            }
        }

    private fun gameOver(){
        println("JUEGO TERMINADO")
    }

    //resta una vida al jugador
    private fun die(){
        lives--
        println("Has perdido una vida!")
    }

    //el modificador public es redundante
    //en funcion del objeto colisionante, se ejecuta un evento
    public fun collision(collisionObj: String){
        when(collisionObj){
            "Goomba" -> lives--
            "Super Mushroom" -> state = "Super mario"
            "Fire flower" -> state = "Fire mario"
            else -> println("Objeto desconocido ¡no pasa nada!")
        }
    }

    fun getLives(): String{
        return "$lives vidas"
    }

    val isAlive: Boolean
        get() {
            return lives>=1
        }
}
