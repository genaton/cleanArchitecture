// Modelando a classe Aluno

package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    // esta classe eh considerada ENTIDADE pois possui caracteristica unica como o cpf por exemplo
    
    private CPF cpf; // segue padrao entidade pois eh um atributo unico
    private String nome;
    private Email email;
    private String senha;
    private List<Telefone> telefones  = new ArrayList<>();

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone (String ddd, String numero){
        this.telefones.add(new Telefone(ddd, numero));

    }

    public String getCpf() {
        return cpf.getNumero();
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email.getEndereco();

    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
}
