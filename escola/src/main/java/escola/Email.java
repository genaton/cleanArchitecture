package escola;

public class Email {
        //esta classe é considerada VALUE OBJECT pois nao tem caracteristicas unicas
    private String endereco;

    // regex que valida endereco de email
    public Email (String endereco){
        if(endereco == null || !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            throw new IllegalArgumentException("E-mail não é válido");

        }
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
