package Desafio1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CalculoMedia {

    Double soma = 0.0;
    Double media = 0.0;

    List<Double> listDouble = new ArrayList<>();

    public double calcularMedia(List<BigDecimal> notas) {

        for (int n = 0; n < notas.size(); n++) {

            double notaDouble = notas.get(n).doubleValue(); //CONVERTENDO PARA DOUBLE
            listDouble.add(notaDouble);
        }

        for (int s = 0; s < listDouble.size(); s++) { //SOMANDO TODOS OS VALORES DA ARRAY

            soma += listDouble.get(s);
        }


        for (int m = 0; m < listDouble.size(); m++) { //CALCULANDO A MEDIA

            media = soma / listDouble.size();

        }
        return media;
    }
}
