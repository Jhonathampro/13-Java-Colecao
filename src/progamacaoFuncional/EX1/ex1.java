package progamacaoFuncional.EX1;

import java.util.Arrays;
import java.util.List;

public class ex1 {
    public static void main(String[] args) {
         String[] nomes = {"abacaxi", "staley", "abacate", "turvo"};
         List<String> lista  = Arrays.asList(nomes);

       // O stream() cria um pipeline de operações sobre a coleção.
        // Cada operação (filter, map, etc.) não modifica a lista original, mas gera um novo fluxo de dados até chegar no forEach,
        // que é uma operação terminal.
         lista.stream().filter(nome -> nome.startsWith("a"))
                 .map(String::toUpperCase)
                 .forEach(System.out::println);

    }
}
