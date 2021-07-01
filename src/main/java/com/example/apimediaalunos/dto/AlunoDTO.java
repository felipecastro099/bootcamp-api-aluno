package com.example.apimediaalunos.dto;

import com.example.apimediaalunos.models.Disciplina;

import java.util.List;

public class AlunoDTO {
    private String nome;
    private List<Disciplina> disciplinas;

    public AlunoDTO(String nome, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    @Override
    public String toString() {
        return "AlunoDTO{" +
                "nome='" + nome + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
