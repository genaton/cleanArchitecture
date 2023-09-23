
package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import br.com.alura.escola.dominio.aluno.Email;
import org.junit.jupiter.api.Test;

public class EmailTest {
    
    @Test
    void naoDeveriaCriarEmailsInvalidos(){
        assertThrows(IllegalArgumentException.class,
        ()-> new Email(null));

        assertThrows(IllegalArgumentException.class,
        ()-> new Email(""));

        assertThrows(IllegalArgumentException.class,
        ()-> new Email("emailinvalido"));
    }
}
