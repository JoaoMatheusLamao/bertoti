package entities;

import java.util.LinkedList;
import java.util.List;

public class Aluno {
    private int ra;
    private String nome;
    private boolean status;
    private List<Disciplina> disciplinas = new LinkedList();

    public Aluno(int ra, String nome, boolean status) {
        this.ra = ra;
        this.nome = nome;
        this.status = status;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void matricularAlunoDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

}
