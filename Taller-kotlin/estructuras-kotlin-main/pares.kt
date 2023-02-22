//pregunte al usuario su nombre y edad, pongalos en un par y luego imprima el nombre con la edad correspondiente

fun main(){

    fun info(): Pair<String, Int> {
        println("ingrese su nombre")
        var name = readLine()!!
        println("ingrese su edad")
        var age = readLine()!!.toInt()
        
        return Pair("$name", age)
    }

    val (name, age) = info()
    println("Nombre: $name, Edad: $age")
}