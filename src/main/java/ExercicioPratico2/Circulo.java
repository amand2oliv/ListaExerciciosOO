package ExercicioPratico2;

public class Circulo implements FormaGeometrica{

    //ATRIBUTOS
    private double raio;

    //CONSTRUTORES

    public Circulo(double raio) {
        this.raio = raio;
    }

    //GETTERS AND SETTERS

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    //IMPLEMENTAÇAO

    @Override
    public double getArea() {
        return 3.14 * Math.pow(raio,2);
    }

    @Override
    public double getComprimetro() {
        return 2 * 3.14 * raio;
    }
}
