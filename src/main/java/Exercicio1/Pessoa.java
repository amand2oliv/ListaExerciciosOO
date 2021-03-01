package Exercicio1;

import lombok.*;

import java.time.LocalDate;
import java.time.Period;


//ORIENTAÇÃO A OBJETO PARTE 2: APLICAR LOMBOK
//LOMBOK É UM FACILITADOR PARA CONSTRUÇÃO DE CLASSES
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Pessoa{

    private String nome;
    private LocalDate nascimento;
    private double altura;

//DESCOMENTE O BLOCO A SEGUIR PARA RODAR O PROGRAMA SEM LOMBOK =)
   /* public Pessoa(String nome, LocalDate nascimento, double altura){

        this.nome = nome;
        this.nascimento = nascimento;
        this.altura = altura;
    }

    // GETTANDO
    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public double getAltura() {
        return altura;
    }

    //SETTANDO
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //METODO PARA IMPRIMIR TODOS OS DADOS

    @Override
    public String toString() {
        return
                "Meu nome é  " + nome +
                " nasci em " + (nascimento) +
                ", tenho " + altura +
                " de altura" + " e tenho " + calcularIdade() + " anos."; } */

    //METODO PARA CALCULO DA IDADE
    //NOTAS: VOID NAO RETORNA NADA E QUANDO TEM UM TIPO (class, int..) RETORNA =)

    public int calcularIdade(){

        return  Period.between(this.getNascimento(),LocalDate.now()).getYears();

    }


}
