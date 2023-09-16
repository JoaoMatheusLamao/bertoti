package testes;

import entities.Professor;
import entities.Secretaria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecretariaTest {

    @Test
    void test(){
        Secretaria sec = new Secretaria();
        sec.cadastrarProfessor(new Professor(1, "Giuliano Bertoti"));

        assertEquals(1, sec.getProfessores().size());

        sec.cadastrarProfessor(new Professor(2, "HAHAHA"));

        assertEquals(2, sec.getProfessores().size());
    }

}