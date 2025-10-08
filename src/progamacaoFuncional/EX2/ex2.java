package progamacaoFuncional.EX2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ex2 {
    public static void main(String[] args) {
        List<Empregado> lista = new ArrayList<>();
        lista.add(new Empregado("João", 5, 200));
        lista.add(new Empregado("Bernardo", 10, 500));
        lista.add(new Empregado("Davi", 15, 1000));

        Predicate<Empregado> filtro = e -> e.anosExpeeriencia() >= 5;


        lista.stream().map(e -> new Empregado(e.nome(), e.anosExpeeriencia(),
                e.salario() * (filtro.test(e) ? 1.2 : 1.1) )).
                forEach(System.out::println);
    }
}
