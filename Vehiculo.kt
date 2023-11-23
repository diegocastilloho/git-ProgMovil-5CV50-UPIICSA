class Vehiculo constructor(val marca: String, val modelo: String, var color: String="negro") {
    init {
        println("""Los datos del coche son:
                var color = $color
                var marca = $marca
                var modelo = $modelo""")
    }
    constructor(marca: String, modelo: String, color: String, placas: String): this(marca, modelo, color){
        this.placas = placas
        println("Las placas son: ${this.placas}")
    }
    var placas = ""
    var gasolina = 0f
    var encendido = false

    fun encender(){
        encendido= true;
    }

    fun apagar(){
        encendido = false
    }

    fun recargar (litros:Float){
        gasolina+=litros
    }
}
