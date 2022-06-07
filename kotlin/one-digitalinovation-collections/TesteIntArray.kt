package `one-digitalinovation-collections`

fun main() {

    val values = IntArray(5)

    values[0] = 5
    values[1] = 10
    values[2] = 4
    values[3] = 6
    values[4] = 8


    for (valor in values){
        println(valor)
    }

    println("---------------------")
    values.sort()
    for (valor in values){
        println(values)
    }

    println("---------------------")
    for (index in values.indices){
        println(values.indices)
    }




}