abstract class Travel {
    abstract val country: String
    abstract val city: String
    protected val serviceType = "Viaje"
    protected var reserved = false
    protected var paidAmount = 0

    abstract fun quotePrice(numDays: Int)
    protected abstract fun getPrice(numDays: Int): Int

    fun reserve(numDays: Int){
        if (reserved){
            println("""¡Ya reservaste tu viaje!
                    Pais: $country
                    Ciudad: $city
                    Precio: $paidAmount""".trimMargin())
            return
        }
        val amount = getPrice(numDays)
        if (amount==0){
            return
        }
        reserved = true
        paidAmount = amount
        println("""¡Viaje reservado exitosamente!
                Pais: $country
                Ciudad: $city
                Precio: $paidAmount""".trimMargin())
    }
}
