fun main() {
    println("Escolhe um mês 1-12")
    val mes = readln().toInt()

    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
        println("O mês tem 31 dias")
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
        println("O mês tem 30 dias")
    } else if (mes == 2) {
        println("O mês tem 28 ou 29 dias")
    } else {
        println("Mês inválido")
    }
}
