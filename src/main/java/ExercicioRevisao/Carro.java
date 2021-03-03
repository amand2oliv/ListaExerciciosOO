package ExercicioRevisao;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Carro extends Automovel {

    private boolean tetoSolar;
    private boolean automatico;

    @Override
    public String toString() {
        return "[CARRO]\n" +
                "Modelo: " + getModelo() + "\n" +
                "Placa: " + getPlaca() + "\n" +
                "Tetor Solar: " + isTetoSolar() + "\n" +
                "Câmbio Automático: " +isAutomatico() + "\n" +
                "-------------------";
    }
}
