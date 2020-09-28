package com.digitalhouse.br.DesafioKotlin

class Curso(val nome: String, val codCurso: Int, val qtdMaxima: Int) {

    var listaAlunosMatriculados = mutableListOf<Aluno>()

    lateinit var professorTitular: Any
    lateinit var professorAdjunto: Any

    fun adicionarUmAluno(umAluno: Aluno) : Boolean {
        return if (listaAlunosMatriculados.size < this.qtdMaxima) {
            listaAlunosMatriculados.add(umAluno)
            true
        } else {
            false
        }
    }

    fun excluirAluno(umAluno: Aluno){
        listaAlunosMatriculados.remove(umAluno)
    }

}