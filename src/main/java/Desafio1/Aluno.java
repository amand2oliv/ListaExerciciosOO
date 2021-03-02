package Desafio1;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Aluno {

    private String ra;
    private String nomeCompleto;
    private List<BigDecimal> notas;
}
