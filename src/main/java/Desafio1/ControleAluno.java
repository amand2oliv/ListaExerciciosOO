package Desafio1;

import java.math.BigDecimal;
import java.util.List;


public class ControleAluno {

    private static double mediaCalculo;

    public static void cadastrarAluno(List<Aluno> listAlunos, String ra, String nome){

        Aluno alunoUm = new Aluno();
        alunoUm.setRa(ra);
        alunoUm.setNomeCompleto(nome);
        listAlunos.add(alunoUm);

    }

    public static void cadastrarNotaAluno(List<Aluno> listAlunos, String ra, List<BigDecimal> notas){

        for(int i = 0; i < listAlunos.size(); i++){

            if(listAlunos.get(i).getRa().equals(ra)){

                listAlunos.get(i).setNotas(notas);
            }
        }
    }

    public static double mostrarMediaAluno(List<Aluno> listAlunos, String ra){

        for(int i = 0; i < listAlunos.size(); i++){

                if(listAlunos.get(i).getRa().equals(ra)){

                CalculoMedia calculoMedia = new CalculoMedia();

                mediaCalculo = calculoMedia.calcularMedia(listAlunos.get(i).getNotas());
                }
            }

    return mediaCalculo;

    }

    public static void removerAluno(List<Aluno> listAlunos, String ra){

        for(int i = 0; i < listAlunos.size(); i++){

            if(listAlunos.get(i).getRa().equals(ra)){

                listAlunos.remove(i);
            }

    }

}

    public static boolean consultarStatusAluno (List<Aluno> listAlunos, String ra) {

        boolean isAprovado = false;

        for (int i = 0; i < listAlunos.size(); i++) {

            if (listAlunos.get(i).getRa().equals(ra)) {

                if(mostrarMediaAluno(listAlunos, ra) > 6){

                    isAprovado = true;

                } else {

                    isAprovado = false;

                }

            }

        }

        return isAprovado;
    }
}
