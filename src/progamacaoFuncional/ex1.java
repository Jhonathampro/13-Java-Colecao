package progamacaoFuncional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex1 {
    public static void main(String[] args) {
         String[] nomes = {"abacaxi", "staley", "abacate", "turvo"};
         List<String> lista  = Arrays.asList(nomes);

         lista.stream().filter(nome -> nome.startsWith("a"))
                 .map(String::toUpperCase)
                 .forEach(System.out::println);

    }
}
