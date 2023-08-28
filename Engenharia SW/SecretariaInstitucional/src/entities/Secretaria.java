package entities;

import java.util.LinkedList;
import java.util.List;

public class Secretaria {
    List<Aluno> alunos = new LinkedList<>();
    List<Professor> professores = new LinkedList<>();

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public void matricularAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public boolean validarMatriculaAtiva(int ra){
        for (Aluno a: alunos){
            if (a.isStatus()) return true;
        }
        return false;
    }
}
