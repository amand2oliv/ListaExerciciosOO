package ExercicioRevisao;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Caminhao extends Automovel{

    private String capacidadeCarga;
    private String comprimento;

    @Override
    public String toString() {
        return "[CAMINHÃO]\n" +
        "Modelo: " + getModelo() + "\n" +
        "Placa: " + getPlaca() + "\n" +
        "Capacidade de Carga: " + getCapacidadeCarga() + "\n" +
        "Comprimento: " +getComprimento() + "\n" +
         "-------------------";
    }
}


