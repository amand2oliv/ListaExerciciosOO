package ExercicioRevisao;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Menu {

    private String menu;

    public String getMenu() {

        menu = "1 - Cadastrar carro\n" +
                "2 - Cadastrar caminhão\n"+
                "3 - Listar veículos\n" +
                "4 - Sair do programa";

        return menu;
    }

}
