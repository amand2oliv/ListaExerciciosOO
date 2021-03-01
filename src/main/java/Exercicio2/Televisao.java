package Exercicio2;


import lombok.*;

//ORIENTAÇÃO A OBJETOS PARTE 2: APLICANDO LOMBOK
//LOMBOK É UM FACILITADOR PARA CONSTRUÇÃO DE CLASSES
@Getter
@Setter
@AllArgsConstructor
@ToString
// O @NoArgsConstructor não é necessário pois esse construtor foi personalizado

public class Televisao {

    //ATRIBUTOS
    private Integer volume;
    private Integer canal;
    private boolean isOn;


    //METODOS CONSTRUTORES TEM O MESMO NOME DA CLASSE
    public Televisao(){
        this.canal=1;
        this.volume=50;
        this.isOn=false;
    }

//DESCOMENTE O BLOCO A SEGUIR PARA RODAR O PROGRAMA SEM LOMBOK =)
  /*  public Televisao(Integer volume, Integer canal, boolean isOn){

        this.canal = canal;
        this.volume = volume;
        this.isOn = isOn;
    }

    //GETTERS AND SETTERS

    public Integer getVolume() {
        return volume;
    }

    public Integer getCanal() {
        return canal;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void setCanal(Integer canal) {
        this.canal = canal;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public String toString() {
        return "Televisao{" +
                "volume=" + volume +
                ", canal=" + canal +
                ", isOn=" + isOn +
                '}';
    } */
}
