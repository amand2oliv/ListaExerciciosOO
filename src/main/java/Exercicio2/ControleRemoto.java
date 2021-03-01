/* ORIENTAÇÃO A OBJETO PARTE 1 | TREINAMENTO DE JAVA

EXERCÍCIO 2

Crie  uma  classe Televisao e  uma  classe ControleRemoto que  pode  controlar
o  volume  e trocar os canais da televisão. O controle de volume permite:

    aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
    aumentar e diminuir o número do canal em uma unidade;
    trocar para um canal indicado;
    consultar o valor do volume de som e o canal selecionado.

*/

package Exercicio2;

public class ControleRemoto {

     static String ligar = "Ligue a TV";

    public static void main(String[] args) {

        Televisao televisao = new Televisao(70,4,true);

        System.out.println(televisao);

        televisao.setOn(true);

        System.out.println(televisao);

        controlarVolume(televisao, true);

        System.out.println(televisao);

        controlarCanal(televisao, false);

        System.out.println(televisao);

        indicarCanal(televisao, 9);

        System.out.println(televisao);

        System.out.println(feedback(televisao));

    }

    protected static void controlarVolume(Televisao tv, boolean vol) {

        if(tv.isOn()){
            if (vol) { //AUMENTAR
                tv.setVolume(tv.getVolume() + 1);

                System.out.println("Volume aumentado");

            } else { //DIMINUIR
                tv.setVolume(tv.getVolume() - 1);

                System.out.println("Volume diminuído");

            }

        }else{
            System.out.println(ligar);
        }

    }

    protected static void controlarCanal(Televisao tv, boolean channel) {

        if(tv.isOn()){
            if (channel) { //AUMENTAR
                tv.setCanal(tv.getCanal() + 1);

                System.out.println("Canal aumentado");

            } else { //DIMINUIR
                tv.setCanal(tv.getCanal() - 1);

                System.out.println("Canal diminuído");

            }

        }else{

            System.out.println(ligar);

        }

    }
    protected static void indicarCanal(Televisao tv, int num) {

        if (tv.isOn()) {

                tv.setCanal(num);

            System.out.println("Canal alterado para: " + num);

        } else {

            System.out.println(ligar);
        }
    }

    protected static String feedback(Televisao tv) {

        return "O canal atual é " + tv.getCanal() + "\nO volume atual é " + tv.getVolume();
    }
}




