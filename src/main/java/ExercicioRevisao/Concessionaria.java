/*
ORIENTAÇÃO A OBJETO REVISÃO | TREINAMENTO DE JAVA

EXERCÍCIO DE REVISÃO

Crie um sistema que simulará uma concessionária de carros, o sistema deverá ter:
• Um menu para a seleção de no mínimo, 3 opções, cadastrar, listar e sair do sistema.
• Uma classe para a concessionária.
• Uma classe pai “Automovel”, tendo duas classes filhas Carro e Caminhão.
• Uma interface com as funcionalidades que a concessionária deve ter.
• Utilizar os conceitos de orientação a objeto.
 */

package ExercicioRevisao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Concessionaria implements Interface{

    static boolean isRodando = true;

    public static void main(String[] args) {


        Concessionaria cs = new Concessionaria();

        List<Automovel> allAutoList = new ArrayList<>();

        Menu menu = new Menu();

        Scanner sc = new Scanner(System.in);

        while (isRodando){
            System.out.println("Selecione a opção desejada:\n" + menu.getMenu());

            int opcao = sc.nextInt();

            if(opcao == 1){

                Carro novoCarro = new Carro();

                System.out.println("Informe o modelo do carro: ");
                String model= sc.next();
                novoCarro.setModelo(model); //SETTANDO MODELO

                System.out.println("Informe a placa do carro: ");
                String placa = sc.next();
                novoCarro.setPlaca(placa); //SETTANDO PLACA

                System.out.println("O carro possui teto solar?\n"+
                        "[1]SIM\n" +
                        "[2]NÃO");
                int a = sc.nextInt();

                switch (a){
                    case 1: //REGISTRO DE TETO SOLAR
                        novoCarro.setTetoSolar(true);
                        break;

                    case 2:
                        novoCarro.setTetoSolar(false);
                        break;
                }

                System.out.println("O carro é automático?\n"+
                        "[1]SIM\n" +
                        "[2]NÃO");
                int b = sc.nextInt();

                switch (b){
                    case 1: //REGISTRO DE CAMBIO AUTOMATICO

                        novoCarro.setAutomatico(true);
                        break;

                    case 2:
                        novoCarro.setAutomatico(false);
                        break;
                }
                cs.cadastrar(novoCarro, allAutoList);

                System.out.println("Veículo registrado com sucesso!");

            }else if(opcao == 2) {

                Caminhao novoCaminhao = new Caminhao();

                System.out.println("Informe o modelo do caminhão: ");
                String model = sc.next();
                novoCaminhao.setModelo(model); //SETTANDO MODELO


                System.out.println("Informe a placa do caminhão: ");
                String placa = sc.next();
                novoCaminhao.setPlaca(placa); //SETTANDO PLACA


                System.out.print("Registre a capacidade de carga do caminhão: ");
                String carga = sc.next();
                novoCaminhao.setCapacidadeCarga(carga);


                System.out.print("Registre o comprimento do caminhão: ");
                String comprimento = sc.next();
                novoCaminhao.setComprimento(comprimento);

                cs.cadastrar(novoCaminhao, allAutoList);
                System.out.println("Veículo registrado com sucesso!");

            } else if(opcao == 3){

                cs.listar(allAutoList);

            } else if (opcao == 4){
                cs.sair();
            }

        }

    }


    @Override
    public void cadastrar(Automovel novoAuto, List<Automovel> allAutoList) {

        allAutoList.add(novoAuto);


    }

    @Override
    public void listar(List<Automovel> autoList) {

        for (Automovel automovel: autoList){
            System.out.println(automovel);

        }

    }

    @Override
    public void sair() {
        isRodando = false;
    }
}
