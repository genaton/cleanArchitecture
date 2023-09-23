package br.com.alura.escola.dominio.aluno;

//Padrão Builder* padrao de construcao de objetos * diferente do Factory Method
public class FabricaDeAluno {

    private Aluno aluno;
    public FabricaDeAluno comNomeCPFEmail(String nome, String cpf, String email){
        this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
        return this;
    }

    public FabricaDeAluno comTelefone(String ddd, String numero){
        this.aluno.adicionarTelefone(ddd, numero);
        return this;
    }

    public Aluno criar(){
        return this.aluno;
    }
//Exempo de instaciamento do Factory Builder
    public static void main(String[] args) {
        FabricaDeAluno fabricaDeAluno = new FabricaDeAluno();
        fabricaDeAluno.comNomeCPFEmail("Fulano", "12345678900","fulano@net.com")
                .comTelefone("00","000000")
                .comTelefone("11","1111111")
                .criar();
    }


}
