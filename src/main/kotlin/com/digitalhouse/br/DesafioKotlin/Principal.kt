package com.digitalhouse.br.DesafioKotlin

fun main() {
    val manager = DigitalHouseManager()

    manager.registrarAluno("Breno", "Novaes", 1)
    manager.registrarAluno("João", "Silva", 2)

    manager.registrarProfessorTitular("José", "Santos", 0, "Full Stack")

    val profTitular1 = ProfessorTitular("José", "Santos", 0, 1, "Full Stack")
    val profTitular2 = ProfessorTitular("Joana", "Oliveira", 0, 2, "Android")

    val profAdjunto1 = ProfessorAdjunto("Maria", "Souza", 0, 3, 7)
    val profAdjunto2 = ProfessorAdjunto("Anderson", "Matos", 0, 4, 16)

    val curso1 = Curso("Full Stack", 20001, 3, profTitular1, profAdjunto1)
    val curso2 = Curso("Android", 20002, 2, profTitular2, profAdjunto2)

}