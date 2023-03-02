fun main() {
    val stringInformada = "Target Sistemas"
    val stringEmLista = stringInformada.toMutableList()
    val stringRevertidaEmLista = mutableListOf<Char>()
    for (i in stringEmLista.size - 1 downTo 0) {
        stringRevertidaEmLista.add(stringEmLista[i])
    }
    val stringRevertida = stringRevertidaEmLista.joinToString("")

    println(stringRevertida)
}