package Prototype;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DevTest {

    @Test
    void testClone() throws CloneNotSupportedException{
        Dev dev = new Dev("Pedro", "Vasconcelos", 21, "test@example.com", new Cargo("Front end Junior", 3000));

        Dev devClone = dev.clone();
        devClone.setNome("Henrique");
        devClone.getCargo().setFuncao("Back end Junior");

        assertEquals("Dev{nome='Pedro', sobrenome='Vasconcelos', idade=21, email='test@example.com', cargo=Cargo{funcao='Front end Junior', salario=3000}}", dev.toString());
        assertEquals("Dev{nome='Henrique', sobrenome='Vasconcelos', idade=21, email='test@example.com', cargo=Cargo{funcao='Back end Junior', salario=3000}}", devClone.toString());
    }

}
