import entities.Aluno;
import entities.Disciplina;
import entities.Professor;
import entities.Secretaria;

public class Program {
    public static void main(String[] args) {
        Professor prof1 = new Professor(0, "Giuliano Bertoti");
        Professor prof2 = new Professor(1, "Adriana Jacinto");

        Disciplina disc1 = new Disciplina("Engenharia de Software", prof1);
        Disciplina disc2 = new Disciplina("Linguagem de programação 1", prof2);

        Aluno al1 = new Aluno(12345,"João Matheus Lamão", true);
        al1.matricularAlunoDisciplina(disc1);
        al1.matricularAlunoDisciplina(disc2);

        Aluno al2 = new Aluno(312,"Ana Raquel Sasaki", true);
        al2.matricularAlunoDisciplina(disc1);

        Aluno al3 = new Aluno(123,"Beatriz Bonatto", false);
        al3.matricularAlunoDisciplina(disc2);


        Secretaria secretaria = new Secretaria();

        secretaria.cadastrarProfessor(prof1);
        secretaria.cadastrarProfessor(prof2);

        secretaria.matricularAluno(al1);
        secretaria.matricularAluno(al2);
        secretaria.matricularAluno(al3);

        System.out.println(secretaria.consultarMatricula(12345));

        System.out.println("\n=================\n");

        System.out.println(secretaria.validarMatriculaAtiva(12345));
        System.out.println(secretaria.validarMatriculaAtiva(123));

        System.out.println("\n=================\n");

        System.out.println(secretaria.emitirAtestadoMatricula(312));
        System.out.println(secretaria.emitirAtestadoMatricula(123));
    }
}
