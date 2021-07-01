package com.example.apimediaalunos.controllers;

import com.example.apimediaalunos.dao.AlunoDAO;
import com.example.apimediaalunos.dto.AlunoDTO;
import com.example.apimediaalunos.dto.AlunoResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @PostMapping()
    public ResponseEntity<?> taAprovado(@RequestBody AlunoDTO aluno) {
        System.out.println(aluno.toString());
        AlunoDAO alunoDAO = new AlunoDAO();
        String mensagem = alunoDAO.mensagem(alunoDAO.calcularMedia(aluno.getDisciplinas()));
        Double media = alunoDAO.calcularMedia(aluno.getDisciplinas());

        AlunoResponseDTO response = new AlunoResponseDTO(alunoDAO.aluno(aluno), mensagem, media);

        return ResponseEntity.ok(response);
    }
}
