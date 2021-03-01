/*
ORIENTAÇÃO A OBJETO PARTE 1 | TREINAMENTO DE JAVA

EXERCÍCIO PRÁTICO 2

Construir a classe Quadrado que implementa a interface Forma Geometrica;
Implementar programa de testes que declara duas variáveis do tipo FormaGeometrica
e instancia dois objetos um do tipo Circulo e outro do tipo Quadrado.
Exibir a área e o comprimento dos objetos instanciados.

*/

package ExercicioPratico2;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um lado para o quadrado: ");
        double lado = sc.nextDouble();


        FormaGeometrica formaQ = new Quadrado(lado);

        System.out.println("A área é: " + formaQ.getArea());
        System.out.println("O comprimento (perímetro) é: " + formaQ.getComprimetro());

        System.out.println("Digite um raio para o círculo: ");
        double raio = sc.nextDouble();

        FormaGeometrica formaC = new Circulo(raio);

        System.out.println("A área do círculo é " + formaC.getArea());
        System.out.println("O comprimento do círculo é " + formaC.getComprimetro());

    }
}
