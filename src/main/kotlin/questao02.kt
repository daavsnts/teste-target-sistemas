fun main() {
    val numeroInformado = 2
    val tamanhoMinimo = 2
    var termo1 = 0
    var termo2 = 1
    val listaFibonacci = mutableListOf<Int>()
    var numeroEstaNaLista = false

    var indice = 0
    while (indice < (numeroInformado + tamanhoMinimo) && !numeroEstaNaLista) {
        listaFibonacci.add(termo1)
        if (termo1 == numeroInformado) numeroEstaNaLista = true

        val soma = termo1 + termo2
        termo1 = termo2
        termo2 = soma
        indice++
    }

    println("Lista: $listaFibonacci")
    println("O numero está na lista? R: $numeroEstaNaLista")
}