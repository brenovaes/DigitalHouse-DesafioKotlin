package com.digitalhouse.br.DesafioKotlin

fun main() {
    val manager = DigitalHouseManager()

    manager.registrarAluno("Breno", "Novaes", 1)
    manager.registrarAluno("João", "Silva", 2)
    manager.registrarAluno("Alex", "Pinheiro", 3)
    manager.registrarAluno("César", "Barros", 4)
    manager.registrarAluno("Marta", "Azevedo", 5)


    manager.registrarProfessorTitular("José", "Santos", 1, "Full Stack")
    manager.registrarProfessorTitular("Joana", "Oliveira", 2, "Android")

    manager.registrarProfessorAdjunto("Maria", "Souza", 3, 7)
    manager.registrarProfessorAdjunto("Anderson", "Matos", 4, 16)

    manager.registrarCurso("Full Stack", 20001, 3)
    manager.registrarCurso("Android", 20002, 2)

    manager.alocarProfessores(20001, 1, 3)
    manager.alocarProfessores(20002, 2, 4)

    manager.matricularAluno(1, 20001)
    manager.matricularAluno(2, 20001)
    manager.matricularAluno(3, 20002)
    manager.matricularAluno(4, 20002)
    manager.matricularAluno(5, 20002)

    println("\n------------------")
    println("Lista de alunos:")
    for (aluno in manager.listaAlunos){
        println("Código: ${aluno.codALuno} Nome: ${aluno.nome} | Sobrenome: ${aluno.sobrenome}")
    }

    println("\n------------------")
    println("Lista de professores")
    for (professor in manager.listaProfessores){
        println("Código: ${professor.codProfessor} Nome: ${professor.nome} | Sobrenome: ${professor.sobrenome} | Tempo de casa: ${professor.tempoCasa}")
    }

    println("\n------------------")
    println("Lista de cursos")
    for (curso in manager.listaCursos){
        println("Código: ${curso.codCurso} Nome: ${curso.nome} | Quantidade máxima: ${curso.qtdMaxima}")
    }

    println("\n------------------")
    println("Lista de matrículas")
    for (matricula in manager.listaMatriculas){
        println("Nome: ${matricula.aluno.nome} | Curso: ${matricula.curso.nome} | Data: ${matricula.data}")
    }

}