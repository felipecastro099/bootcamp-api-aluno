package com.example.apimediaalunos.dto;

import com.example.apimediaalunos.models.Aluno;

public class AlunoResponseDTO {
    private Aluno aluno;
    private String mensagem;
    private Double media;

    public AlunoResponseDTO(Aluno aluno, String mensagem, Double media) {
        this.aluno = aluno;
        this.mensagem = mensagem;
        this.media = media;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public String getMensagem() {
        return mensagem;
    }

    public Double getMedia() {
        return media;
    }
}
