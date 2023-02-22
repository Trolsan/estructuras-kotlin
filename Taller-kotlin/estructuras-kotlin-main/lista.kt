// realice una lista con los dias de la semana y aparte que el usuario pueda seleccionar el primer dia de la semana o el ultimo y que tambien pueda ver cuantos dias tiene la semana y enumerarlos

fun main() {

    var menu = """

    MENU DE OPCIONES
    1. Imprime el primer dia de la semana
    2. Imprime el ultimo dia de la semana
    3. Imprime cuantos dias tiene la semana
    4. Imprime los dias de la semana con su indice

    Seleccione una opcion: 

    """

    var lista1: List<String> = listOf("lunes", "martes", "miercoles", "jueves", "viernes", "sábado", "domingo")


    print(menu)
    var opcion = readLine()?.toInt()

    when (opcion) {

        1 -> println(lista1.first()) 

        2 -> println(lista1.last())

        3 -> println("La semana tiene ${lista1.size} dias")

        4 ->  {for(posicion in lista1.indices)
            print("[$posicion] ${lista1[posicion]}")
        }
    else -> println("Opcion invalida")
    }

}