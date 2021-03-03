package ExercicioRevisao;

//ESSA INTERFACE DEVE TER AS FUNCIONALIDADES QUE A CLASSE CONCESSIONARIA VAI IMPLEMENTAR

import java.util.List;

public interface Interface {

    void cadastrar(Automovel auto, List<Automovel> autoList);
    void listar(List<Automovel> autoList);
    void sair();

}
