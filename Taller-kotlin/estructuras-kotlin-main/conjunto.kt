//De un conjunto de numeros del 1 al 20, haga que el usuario ingrese un numero y el sistema le diga si el 
// numero esta o no dentro del conjunto

fun main(){

    val nums = setOf(1,2,5,9,10,11,12,17,18,20)

    var continuar = "si"
    var number: Int

    while(continuar.uppercase() == "SI"){
        println("ingrese un numero del uno al 20")
        number = readLine()!!.toInt()

        if(nums.contains(number)){
            println("el numero se encuentra dentro del conjunto")
        }else{
            println("el numero no se encuentra dentro del conjunto")
        }

        println("desea continuar? (si/no)")
        continuar = readLine()!!
    }
}