package com.example.apimediaalunos.dao;

import com.example.apimediaalunos.dto.AlunoDTO;
import com.example.apimediaalunos.entities.Aluno;
import com.example.apimediaalunos.entities.Disciplina;

import java.util.List;

public class AlunoDAO {

    public Double calcularMedia(List<Disciplina> disciplinas) {
        Double media = 0.0;

        for (Disciplina a : disciplinas) {
            media += a.getNota();
        }

        return media/ disciplinas.size();
    }


    public String mensagem(Double media) {
        if (media > 9) {
            return "Aprovado! Parabéns";
        }

        return "Reprovado! Deu errado";
    }

    public Aluno aluno(AlunoDTO aluno) {
        return new Aluno(aluno.getNome(), aluno.getDisciplinas());
    }

}
