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
            if (a.isStatus() && a.getRa() == ra) return true;
        }
        return false;
    }

    public String emitirAtestadoMatricula(int ra){
        for (Aluno a: alunos){
            if (a.getRa() == ra){
                if (a.isStatus()){
                    String atestado =  "O(a) aluno(a) " + a.getNome() + " está regularmente matriculado nas disciplinas: ";
                    for (Disciplina d: a.getDisciplinas()){
                        atestado += d.getNome() + ", ";
                    }
                    return atestado;
                } else {
                    String atestado =  "O(a) aluno(a) " + a.getNome() + " está com a matrícula trancada nas disciplinas: ";
                    for (Disciplina d: a.getDisciplinas()){
                        atestado += d.getNome() + ", ";
                    }
                    return atestado;
                }
            }
        }
        return null;
    }

    public Aluno consultarMatricula(int ra){
        for (Aluno a: alunos){
            if (a.getRa() == ra){
                return a;
            }
        }
        return null;
    }

    public void cadastrarProfessor(Professor prof){
        professores.add(prof);

    }
}
