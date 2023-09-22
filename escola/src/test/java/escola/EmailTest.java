
package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import escola.Email;

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
