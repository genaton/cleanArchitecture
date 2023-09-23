package br.com.alura.escola.dominio.aluno;

//trata-se de servico da aplicacao. servico de cifrar senhas. mas que fica na camada de dominio.
public interface CifradorDeSenha {
    String cifrarSenha(String senha);

    boolean validarSenhaCifrada(String senhaCifrada, String senha);
}
