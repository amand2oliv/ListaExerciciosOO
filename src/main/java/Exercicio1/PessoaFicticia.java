/* ORIENTAÇÃO A OBJETO PARTE 1 | TREINAMENTO DE JAVA

EXERCÍCIO 1

Crie uma classe para representar uma pessoa, com os atributos privados de nome,
data de nascimento e altura. Crie os métodos públicos necessários para sets e
gets e também um método para imprimir todos dados de uma pessoa.
Crie um método para calcular a idade da pessoa. */


package Exercicio1;

import java.time.LocalDate;

public class PessoaFicticia {

    public static void main(String[] args) {

        Pessoa amanda = new Pessoa();

        amanda.setNome("Amanda");
        amanda.setAltura(1.57);
        LocalDate data = LocalDate.of(2002, 01,10);
        amanda.setNascimento(data); //RECEBE UM PARAMETRO DO TIPO LOCALDATE


        Pessoa bruno = new Pessoa();

        bruno.setNome("Bruno");
        bruno.setAltura(1.75);
        bruno.setNascimento(LocalDate.of(2001, 06,27));

        System.out.println(amanda);
        System.out.println(bruno);

        //PESSOA COM PARAMETROS

        String nome = "Sandra";
        double altura = 1.55;
        LocalDate nascimento = LocalDate.of(1972,11,26);

        Pessoa pessoaComParametro = new Pessoa(nome, nascimento, altura);

        System.out.println(pessoaComParametro);

    }

}
