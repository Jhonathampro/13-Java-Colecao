package progamacaoFuncional.EX1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex001 {
    public static void main(String[] args) {
        String nomes [] = {"abacaxi", "abacate", "php", "cenoura"};
        List<String> lista = Arrays.asList(nomes);

        lista.stream().filter(nome -> nome.startsWith("a")).
                map(String::toUpperCase).
                   forEach(System.out::println);
    }
}
