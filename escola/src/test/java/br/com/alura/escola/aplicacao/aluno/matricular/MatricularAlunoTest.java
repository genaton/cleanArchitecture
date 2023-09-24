package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatricularAlunoTest {
    @Test
    void alunoDeveriaSerPersisitido(){
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);
        MatricularAlunoDTO dados = new MatricularAlunoDTO("fulano",
                "123.456.789-00",
                "funlano@email.com");
        useCase.executa(dados);
        Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-00"));
        assertEquals("fulano", encontrado.getNome());
        assertEquals("123.456.789-00", encontrado.getCpf());
        assertEquals("funlano@email.com", encontrado.getEmail());


    }
}
