fun main() {

    var menu = """

    Menu
    1. Imprime los dias habiles de trabajo
    2. Imprime los dias con los fines de semana

    Seleccione una opcion:
    """

    print(menu)
    var opcion = readLine()?.toInt()

    val semana: MutableMap<Int, String> = mutableMapOf (
        1 to "Lunes",
        2 to "Martes",
        3 to "Miercoles",
        4 to "Jueves",
        5 to "Viernes"
    )

    when (opcion) {
        1 -> println("Los dias habiles de trabajo son: $semana")

        2 -> {
            println("La semana cuenta con dos dias de descanso: ")
            semana.put(6, "Sabado")
            semana.put(7, "Domingo")
            println(semana)
    }

    }
}