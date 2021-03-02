package Desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {

        int opcaoMenu = 10;

        List<Aluno> listAlunos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (opcaoMenu != 0){
            System.out.println("Selecione uma opção:\n" +
                    "0 - Sair\n" +
                    "1 - Cadastrar aluno\n" +
                    "2 - Cadastrar notas\n" +
                    "3 - Consultar média aluno\n" +
                    "4 - Remover aluno");
            opcaoMenu = sc.nextInt();
            switch (opcaoMenu)

            { case 1:
                System.out.println("Digite o nome do aluno: ");
                String nome = sc.next();
                System.out.println("Informe a matrícula: ");
                String ra = sc.next();
                ControleAluno.cadastrarAluno(listAlunos, ra, nome);
                System.out.println("Cadastrado com sucesso");
                break;

                case 2:

                    break;

            }




            }
        }



        //ControleAluno.cadastrarAluno(listAlunos, "10010304", "Byun Baekhyun");

        //System.out.println(listAlunos);

    }
