package com.digitalhouse.br.DesafioKotlin

class Curso(val nome: String, val codCurso: Int, val qtdMaxima: Int) {

    var listaAlunosMatriculados = mutableListOf<Aluno>()

    var professorTitular = null
    var professorAdjunto = null

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