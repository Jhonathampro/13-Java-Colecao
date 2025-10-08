package progamacaoFuncional.EX2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Empregado> lista = new ArrayList<>();
        lista.add( new Empregado("Lucas", 5, 5000));
        lista.add(new Empregado("Lucas", 15, 15000));
        lista.add(new Empregado("JV", 1, 1000));

        // filtro lógico
        // eu uso para quando o código fica muito grande e crio esse predicate
        // ele retorna uma condção
        Predicate<Empregado> filtro = e -> e.anosExpeeriencia() >= 5;

        // function para referenciar o método getNome()
        // não usa muito, foi só para saber que existe
        Function<Empregado, String> ref = Empregado::nome;

         /*lista.stream()
                 .map(e -> new Empregado(e.nome(), e.anosExpeeriencia(),
                       e.salario() *(e.anosExpeeriencia() >= 5 ? 1.2 : 1.1 )))
                 .sorted(Comparator.comparing(Empregado::nome)
                         .thenComparing(Empregado::salario).reversed())
                 .forEach(System.out::println);
*/
        lista.stream()
                .map(e -> new Empregado(e.nome(), e.anosExpeeriencia(),
                        e.salario() *(filtro.test(e) ? 1.2 : 1.1 )))
                .sorted(Comparator.comparing(ref)
                        .thenComparing(Empregado::salario).reversed())
                .forEach(System.out::println);

       // sorted → ordena os elementos do fluxo (padrão ou com Comparator).
        //   Lambda → forma curta de escrever funções anônimas, muito usada para passar lógica (como critérios de ordenação).

    }
}
