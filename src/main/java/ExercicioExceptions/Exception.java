/* ORIENTAÇÃO A OBJETO PARTE 2 | TREINAMENTO DE JAVA

EXERCICIO 1

Aplique o Lombok nos exercícios de orientação de objeto feitos na aula anterior.

EXERCÍCIO 2

Crie um programa onde terá uma lista de 10 números e em seguida,
peça para o usuário digitar o indice do valor desejado da lista,
o programa deve estar preparadao para não lançar uma exception caso
ele digite um indice que a lista não tenha.
 */


package ExercicioExceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exception extends Throwable {

    public static void main(String[] args) {


        List<Integer> numeros = new ArrayList<Integer>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        numeros.add(60);
        numeros.add(70);
        numeros.add(80);
        numeros.add(90);
        numeros.add(100);

        Boolean repetir = Boolean.FALSE;

        System.out.println(numeros);

        while(Boolean.FALSE.equals(repetir)){

            try{
                Scanner sc = new Scanner(System.in);

                System.out.print("Digite o índice do valor desejado: ");
                Integer indice = sc.nextInt();

                System.out.println("O valor é: " + numeros.get(indice));

                System.out.println("Para sair digite: sair");
                String sair = sc.next();

                if(sair.equalsIgnoreCase("sair")){
                    repetir = true;
                }

            }catch (InputMismatchException erro){ //CAPTURA DA EXCEÇAO

                System.out.print("Índice inválido ou inexistente");
                Scanner sc = new Scanner(System.in);

            } catch (IndexOutOfBoundsException erro2){ //CAPTURA DA SEGUNDA EXCEÇAO
                Scanner sc = new Scanner(System.in);
                System.out.println("Índice inválido ou inexistente.");

            }

        }

    }
}
