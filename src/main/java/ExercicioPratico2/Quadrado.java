package ExercicioPratico2;

public class Quadrado implements FormaGeometrica{

    //ATRIBUTOS

    private double lado;

    //CONSTRUTORES
    public Quadrado(double lado) {
        this.lado = lado;
    }

    //GETTERS AND SETTERS

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    //IMPLEMENTAÇAO

    @Override
    public double getArea() {

        return getLado() * getLado();
    }

    @Override
    public double getComprimetro() {

        return getLado() * 4;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }

    /*

    Construir a classe Quadrado que implementa
    a interface Forma Geometrica;

    Implementar programa de e testes que declara duas variáveis
    do tipo FormaGeometrica e instancia dois objetos
    um do tipo Circulo e outro do tipo Quadrado.
    Exibir a área e o comprimento dos objetos instanciados.

    */


}
