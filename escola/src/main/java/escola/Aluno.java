// Modelando a classe Aluno

package escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    // esta classe eh considerada ENTIDADE pois possui caracteristica unica como o cpf por exemplo
    
    private CPF cpf; // segue padrao entidade pois eh um atributo unico
    private String nome;
    private Email email; 
    private List<Telefone> telefones  = new ArrayList<>();

    public void adicionarTelefone (String ddd, String numero){
        this.telefones.add(new Telefone(ddd, numero));

    }

    public CPF getCpf() {
        return cpf;
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

    public Email getEmail() {
        return email;
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
