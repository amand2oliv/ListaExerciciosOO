/*
ORIENTAÇÃO A OBJETO PARTE 2 | TREINAMENTO DE JAVA

DESAFIO 1

Crie um programa que simulará um sistema para cálculo de média de alunos.
O sistema deverá guardar informações do aluno, tais como RA, nome completo e suas notas;
também será necessário implementar os cálculos de média aritmética, e por fim verificar
se o aluno foi aprovado ou reprovado.


Dicas para o desafio:
1 - O Sistema pode ter mais de um aluno
2 - O usuario cadastra os alunos
3 - O usuario escolhe o aluno e pode inserir notas para esse aluno ou consultar a média desse aluno

Dica Menu aluno:
    Digite a opção desejada:
        1 - Cadastrar aluno
        2 - Cadastrar notas
        3 - Consultar média aluno
        4 - Remover aluno */


package Desafio1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleAluno {

    public static void cadastrarAluno(List<Aluno> listAlunos, String ra, String nome){

        Aluno alunoUm = new Aluno();
        alunoUm.setRa(ra);
        alunoUm.setNomeCompleto(nome);
        listAlunos.add(alunoUm);

    }

    public void cadastrarNotaAluno(List<Aluno> listAlunos, String ra, List<BigDecimal> notas){

        for(int i = 0; i < listAlunos.size(); i++){

            if(listAlunos.get(i).equals(ra)){

                listAlunos.get(i).setNotas(notas);

            }


        }

    }

    public void mostrarMediaAluno(List<Aluno> alunos, String ra){

    }

    public void removerAluno(List<Aluno> alunos, String ra){

    }

}
