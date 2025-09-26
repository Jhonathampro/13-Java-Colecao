package progamacaoFuncional.EX1;


import java.util.Arrays;
import java.util.List;

public class ex01 {
    public static void main(String[] args) {
        String[] nomes = {"java", "php", "laravel", "docker"};
        List<String> lista = Arrays.asList(nomes);

        lista.stream().filter(nome -> nome.startsWith("d"))
                .map(String::toUpperCase).forEach(System.out::println);
    }
}
