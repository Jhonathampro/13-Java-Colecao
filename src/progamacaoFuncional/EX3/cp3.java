package progamacaoFuncional.EX3;

import java.util.ArrayList;
import java.util.List;

public class cp3 {
    public static void main(String[] args) {
        List<Produtos> lista = new ArrayList<>();
        lista.add(new Produtos("Sabonente",5, "Cuidado"));
        lista.add(new Produtos("Celular",200, "Eletrônicos"));
        lista.add(new Produtos("PC",5000, "Eletrônicos"));
        lista.add(new Produtos("Note",6000, "Eletrônicos"));

        lista.stream().filter(e -> e.categoria() == "Eletrônicos" && e.preco() > 1000)
                .map(e ->  e.nome().toUpperCase() + " preço com desconto " + e.preco() * 0.9).toList().forEach(System.out::println);
        // para fazer uma lista é só conctenar os valores, no outro exemplo vc gerava um novo objeto, aqui vc modifica

    }
}
