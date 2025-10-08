package progamacaoFuncional.EX2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class cp2 {
    public static void main(String[] args) {
        List<Empregado> lista = new ArrayList<>();
        lista.add(new Empregado("jh", 5, 10));
        lista.add(new Empregado("lk", 2, 3));
        lista.add(new Empregado("jho", 10, 80));

        Predicate<Empregado> teste = empregado -> empregado.anosExpeeriencia() >= 5;

        lista.stream().map(e -> new Empregado(e.nome(), e.anosExpeeriencia(),
          e.salario() * (teste.test(e) ? 1.2 : 1.1))).forEach(System.out::println);

    }
}
