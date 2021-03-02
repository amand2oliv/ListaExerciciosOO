package Desafio1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {

        int opcaoMenu = 10;

        List<Aluno> listAlunos = new ArrayList<>();
        List<BigDecimal> listNotas = new ArrayList<>();

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
                    System.out.println("Informe a matrícula do aluno: ");
                    ra = sc.next();
                    System.out.println("1 - Matemática\n2 - Física\n3 - Química\n Digite a nota do aluno para a disciplina 1: ");
                    BigDecimal n1 = sc.nextBigDecimal();
                    listNotas.add(n1);
                    System.out.println("Digite a nota do aluno para a disciplina 2: ");
                    BigDecimal n2 = sc.nextBigDecimal();
                    listNotas.add(n2);
                    System.out.println("Digite a nota do aluno para a disciplina 3: ");
                    BigDecimal n3 = sc.nextBigDecimal();
                    listNotas.add(n3);

                    ControleAluno.cadastrarNotaAluno(listAlunos,ra,listNotas);
                    System.out.println("Notas cadastradas com sucesso");

                    System.out.println(listNotas);

                    break;

                    case 3:
                        System.out.println("Informe a matrícula do aluno: ");
                        ra = sc.next();

                        Double calculoMedia;
                        calculoMedia = ControleAluno.mostrarMediaAluno(listAlunos,ra,listNotas);
                        System.out.println("Consulta realizada com sucesso!\n" + calculoMedia);
            }

            }
        }



        //ControleAluno.cadastrarAluno(listAlunos, "10010304", "Byun Baekhyun");

        //System.out.println(listAlunos);

    }
