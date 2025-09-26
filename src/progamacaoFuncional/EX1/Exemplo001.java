package progamacaoFuncional.EX1;

import java.util.stream.IntStream;

public class Exemplo001 {
    public static void main(String[] args) {
        int[] x = {3, 4, 1, 7, 8};
        IntStream fluxo = IntStream.of(x);

        //filtragem de números impares
      //  fluxo.filter(valor -> valor % 2 != 0).
         //       forEach(valor -> System.out.println(valor));

        //filtragem par
      //  fluxo.filter(valor -> valor % 2 == 0).
         //       forEach(valor -> System.out.println(valor));

        // filtar o número par após triplicar
      //  fluxo.filter(valor -> valor % 2 == 0).
           //     map(valor -> valor * 3 ).
           //     forEach(System.out::println);

        // soma dos elementos usando o reduce
      int soma =  fluxo.reduce(0, (valor, i) -> valor + i);
        System.out.println(soma);
    }
}
