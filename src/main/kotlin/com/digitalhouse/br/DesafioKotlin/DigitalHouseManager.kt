package com.digitalhouse.br.DesafioKotlin

import java.util.*

class DigitalHouseManager() {

    var listaAlunos = mutableListOf<Aluno>()
    var listaProfessores = mutableListOf<Professor>()
    var listaCursos = mutableListOf<Curso>()
    var listaMatriculas = mutableListOf<Matricula>()


    fun registrarCurso(nome: String, codigoCurso: Int,quantidadeMaximaDeAlunos: Int ){
        val curso = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)
        if (!listaCursos.contains(curso)){
            listaCursos.add(curso)
        }
    }

    fun excluirCurso(codigoCurso: Int){
        for (curso in listaCursos){
            if (curso.codCurso == codigoCurso){
                listaCursos.remove(curso)
            }
        }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int){
        val professor = ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras)
        if (!listaProfessores.contains(professor)){
            listaProfessores.add(professor)
        }
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String){
        val professor = ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade)
        if (!listaProfessores.contains(professor)){
            listaProfessores.add(professor)
        }
    }

    fun excluirProfessor(codigoProfessor: Int){
        for (professor in listaProfessores){
            if (professor.codProfessor == codigoProfessor){
                listaProfessores.remove(professor)
            }
        }
    }

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int){
        val aluno = Aluno(nome, sobrenome, codigoAluno)
        if (!listaAlunos.contains(aluno)){
            listaAlunos.add(aluno)
        }
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso:  Int){
        lateinit var cursoObj: Curso
        lateinit var alunoObj: Aluno
        var existeCurso: Boolean = false
        var existeAluno: Boolean = false

        for (curso in listaCursos){
            if (curso.codCurso == codigoCurso){
                cursoObj = curso
                existeCurso = true
            }
        }

        for (aluno in listaAlunos){
            if (aluno.codALuno == codigoAluno){
                alunoObj = aluno
                existeAluno = true
            }
        }

        if (cursoObj.adicionarUmAluno(alunoObj) && existeCurso && existeAluno){
            listaMatriculas.add(Matricula(alunoObj, cursoObj, Date()))
            println("Matrícula realizada com sucesso!")
        } else {
            println("A matrícula não pôde ser realizada por falta de vagas")
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        for (professor in listaProfessores){
            if (professor.codProfessor == codigoProfessorTitular){
                for (curso in listaCursos){
                    if (curso.codCurso == codigoCurso){
                        curso.professorTitular = professor
                    }
                }
            } else if (professor.codProfessor == codigoProfessorAdjunto){
                for (curso in listaCursos){
                    if (curso.codCurso == codigoCurso){
                        curso.professorAdjunto = professor
                    }
                }
            }
        }
    }

}