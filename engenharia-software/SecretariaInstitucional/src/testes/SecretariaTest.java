package testes;

import entities.Aluno;
import entities.Disciplina;
import entities.Professor;
import entities.Secretaria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecretariaTest {

    @Test
    void test(){
        Secretaria sec = new Secretaria();
        sec.cadastrarProfessor(new Professor(1, "Giuliano Bertoti"));

        //teste inserção de professores
        assertEquals(1, sec.getProfessores().size());

        sec.cadastrarProfessor(new Professor(2, "HAHAHA"));

        //teste inserção de professores
        assertEquals(2, sec.getProfessores().size());

        Aluno aluno1 = new Aluno(777888, "João Matheus Lamão", true);

        sec.matricularAluno(aluno1);
        sec.getAlunos().get(0).matricularAlunoDisciplina(new Disciplina("Engenharia de Software", sec.getProfessores().get(0)));

        //teste inserção de alunos (verificando o nome)
        assertEquals(sec.getAlunos().get(0).getNome(),"João Matheus Lamão");

        // teste metodo consultar matricula
        Aluno consultaMatricula = sec.consultarMatricula(777888);

        assertEquals(aluno1, consultaMatricula);


        Aluno aluno2 = new Aluno(123456, "Ana Raquel Yamamoto Sasaki Machado", false);
        sec.matricularAluno(aluno2);

        //teste validar matricula ativa
        assertEquals(false, sec.consultarMatricula(123456).isStatus());

    }

}