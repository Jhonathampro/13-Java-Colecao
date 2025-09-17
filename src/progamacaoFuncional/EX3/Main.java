package progamacaoFuncional.EX3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produtos> lista = new ArrayList<>();
        lista.add(new Produtos("Sabonente",5, "Cuidado"));
        lista.add(new Produtos("Celular",200, "Eletrônicos"));
        lista.add(new Produtos("PC",5000, "Eletrônicos"));
        lista.add(new Produtos("Note",6000, "Eletrônicos"));

        // não terminou
        lista.stream().filter(c -> c.preco() > 1000)
                .map(c -> c.categoria().equals("Eletrônicos"));


    }
}
