/*
ORIENTAÇÃO A OBJETO PARTE 2 | TREINAMENTO DE JAVA

DESAFIO 1

Crie um programa que simulará um sistema para cálculo de média de alunos.
O sistema deverá guardar informações do aluno, tais como RA, nome completo e suas notas;
também será necessário implementar os cálculos de média aritmética, e por fim verificar
se o aluno foi aprovado ou reprovado.

PENDENTE:
CADASTRAR VÁRIAS NOTAS
TRATAR EXCEPTIONS
CONSULTAR TODOS OS ALUNOS CADASTRADOS
*/



package Desafio1;

import java.math.BigDecimal;
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
                    "4 - Remover aluno\n" +
                    "5 - Consultar status de aprovação");
            opcaoMenu = sc.nextInt();
            switch (opcaoMenu)

            { case 1:
                System.out.println("Digite o nome do aluno: ");
                String nome = sc.next();
                System.out.println("Informe a matrícula: ");
                String ra = sc.next();
                ControleAluno.cadastrarAluno(listAlunos, ra, nome);
                System.out.println("Cadastrado com sucesso!");
                break;

                case 2:
                    List<BigDecimal> listNotas = new ArrayList<>();
                    System.out.println("Informe a matrícula do aluno para cadastrar notas: ");
                    ra = sc.next();
                    System.out.println("Digite a nota do aluno para a P1: ");
                    BigDecimal n1 = sc.nextBigDecimal();
                    listNotas.add(n1);
                    System.out.println("Digite a nota do aluno para a  P2: ");
                    BigDecimal n2 = sc.nextBigDecimal();
                    listNotas.add(n2);
                    System.out.println("Digite a nota do aluno para a P3: ");
                    BigDecimal n3 = sc.nextBigDecimal();
                    listNotas.add(n3);

                    ControleAluno.cadastrarNotaAluno(listAlunos,ra,listNotas);
                    System.out.println("Notas cadastradas com sucesso!");


                    break;

                    case 3:
                        System.out.println("Informe a matrícula do aluno para consultar média: ");
                        ra = sc.next();

                        Double calculoMedia;
                        calculoMedia = ControleAluno.mostrarMediaAluno(listAlunos,ra);
                        System.out.println("Consulta realizada com sucesso!\n" + calculoMedia);

                        break;

                case 4:
                    System.out.println("Informe a matrícula do aluno para removê-lo: ");
                    ra = sc.next();
                    ControleAluno.removerAluno(listAlunos,ra);


                    break;

                case 5:
                    boolean isAprovado;

                    System.out.println("Informe a matrícula do aluno para consultar seu status: ");
                    ra = sc.next();

                    isAprovado = ControleAluno.consultarStatusAluno(listAlunos,ra);

                    if(isAprovado){

                        System.out.println("Aluno aprovado =)");
                    } else

                    System.out.println("Aluno reprovado =(");

                    break;
            }

            }
        }


    }
