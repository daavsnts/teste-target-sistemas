import kotlin.math.sqrt

fun main() {
    println("Sequencia A: ${letraA(9)}")
    println("Sequencia B: ${letraB(128)}")
    println("Sequencia C: ${letraC(49)}")
    println("Sequencia D: ${letraD(5)}")
    println("Sequencia E: ${letraE(13)}")
}

fun letraA(numeroFinal: Int): MutableList<Int> {
    val sequenciaA = mutableListOf<Int>()
    var i = 1

    while (i <= numeroFinal) {
        sequenciaA.add(i)
        i += 2
    }
    return sequenciaA
}

fun letraB(numeroFinal: Int): MutableList<Int> {
    val sequenciaB = mutableListOf<Int>()
    var i = 2

    while (i <= numeroFinal) {
        sequenciaB.add(i)
        i *= 2
    }
    return sequenciaB
}

fun letraC(numeroFinal: Int): MutableList<Int> {
    val sequenciaA = letraA(15)
    val sequenciaC = mutableListOf<Int>()
    var i = 0
    var j = 0
    while (i <= numeroFinal) {
        sequenciaC.add(i)
        i += sequenciaA[j]
        j++
    }
    return sequenciaC
}

fun letraD(quantidadeDeNumerosPares: Int): MutableList<Int> {
    val sequenciaNumerosPares = mutableListOf<Int>()
    var par = 2
    for (j in 0 until quantidadeDeNumerosPares) {
        sequenciaNumerosPares.add(par)
        par += 2
    }

    val sequenciaD = mutableListOf<Int>()
    var i = 0
    while (i < sequenciaNumerosPares.size) {
        sequenciaD.add(sequenciaNumerosPares[i] * sequenciaNumerosPares[i])
        i++
    }
    return sequenciaD
}

fun letraE(numeroFinal: Int): MutableList<Int> {
    var termo1 = 0
    var termo2 = 1
    val sequenciaE = mutableListOf<Int>()
    var numeroEncontrado = false

    var indice = 0
    while (indice < numeroFinal && !numeroEncontrado) {
        sequenciaE.add(termo1)
        if (termo1 == numeroFinal) numeroEncontrado = true
        val soma = termo1 + termo2
        termo1 = termo2
        termo2 = soma
        indice++
    }

    return sequenciaE
}