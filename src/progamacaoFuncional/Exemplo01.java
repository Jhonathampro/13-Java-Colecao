package progamacaoFuncional;

import java.util.stream.IntStream;

public class Exemplo01 {
    public static void main(String[] args) {
        int[] x = {3, 4, 1, 7, 8};
        IntStream fluxo = IntStream.of(x);

        // filtragem dos números impares
      //  fluxo.filter(valor -> valor % 2 != 0)
           //     .forEach(valor -> System.out.println(valor));

  /*      fluxo.filter(valor -> valor % 2 != 0)
                .forEach(System.out::println);*/

        // filtragem dos números pares a após triplicar cada número
      /*  fluxo.filter(valor -> valor % 2 == 0)
                .map(valor -> valor * 3)
                .forEach(System.out::println);*/

        // soma dos elementos usando o reduce()
        int soma = fluxo.reduce(0, (total, i) -> total + i);
        System.out.println(soma);


    }
}
