package progamacaoFuncional.EX4;

import java.util.*;
import java.util.function.Predicate;

public class main {
    public static void main(String[] args) {
        List<Produtos> lista = new ArrayList<>();
        lista.add(new Produtos("a", 2.5, "ele", 5, true));
        lista.add(new Produtos("b", 8.5, "lava", 4, true));
        lista.add(new Produtos("c", 12.5, "ele", 5, false));

        Predicate<Produtos> filtro = e -> e.categororia().equals("ele");

        List<Produtos> eletronicos = new ArrayList<>();
        List<Produtos> outros = new ArrayList<>();


        lista.stream().filter( p -> p.esEstoque() == true && p.avalicao() >= 4).
                map(p -> new Produtos(p.nome().toUpperCase()
                        , p.preco() * (filtro.test(p) ? 0.85 : 0.9), p.categororia(),
                        p.avalicao(), p.esEstoque())).forEach(p -> {
                    if (p.categororia().equals("ele")) {
                        eletronicos.add(p);
                    } else {
                        outros.add(p);
                    }
                });

          double soma = 0, media, min = Double.MAX_VALUE, max = Double.MIN_VALUE;
          int cont = 0;
          Set<Produtos> categoria = new HashSet<>(eletronicos);
          categoria.addAll(outros);


             for (Produtos p : categoria) {
                 soma += p.preco();
                 cont++;
                 if (min > p.preco()) {
                     min = p.preco();
                 }
                 if (max < p.preco()) {
                     max = p.preco();
                 }

             }

             media = soma / cont;
          Comparator<Produtos> criterio = Comparator.comparingDouble(Produtos::preco).reversed();
          categoria.stream().sorted(criterio) .limit(1).forEach(System.out::println);

             System.out.println(media);
             System.out.println(cont);

    }
}
