package progamacaoFuncional.EX1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cp1 {
    public static void main(String[] args) {
        String a [] = {"abacaxi", "abacate", "uva", "batata"};
        List<String> lista = Arrays.asList(a);

        lista.stream().filter(letra -> letra.startsWith("a")).map(b -> b.toUpperCase()).forEach(System.out::println);
    }
}
