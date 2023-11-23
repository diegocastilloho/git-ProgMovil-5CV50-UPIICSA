open class National(override val city: String) : Travel() {

    override val country= "Mexico"

    //este map es un catalogo los diferentes precios por dia dependiendo de la ciudad
    protected val fees = mapOf(
        "Monterrey" to 400,
        "Guadalajara" to 350,
        "CDMX" to 360,
        "San Cristobal de las Casas" to 240,
        "San Miguel de Allende" to 320
    )

    override fun getPrice(numDays: Int): Int {
        val fee = fees(city) //obtenemos la tarifa segun la ciudad
        return if (fee==null) 0 else fee*numDays //regresamos 0 si no hay tarifa, si si, hacemos el calculo
    }

    override fun quotePrice(numDays: Int) {
        val price = getPrice(numDays)
        if (price==0){ //si no existe tarifa para esa ciudad, notificamos al usuario
            println("Lo sentimos, no hacemos viajes a esa ciudad")
        } else {
            println("Tu viaje a $city cuesta \$$price") //notificamos el precio al usuario
        }
    }
}
