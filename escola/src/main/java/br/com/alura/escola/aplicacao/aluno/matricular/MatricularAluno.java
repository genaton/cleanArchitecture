package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.dominio.aluno.Aluno;

public class MatricularAluno {
    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }
    //design patter command
    public void executa (MatricularAlunoDTO dados){
        Aluno novo = dados.criarAluno();
        repositorio.matricular(novo);

    }
}
