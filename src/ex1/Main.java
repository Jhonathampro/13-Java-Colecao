package ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Candidato> lista = new ArrayList<>();
        lista.add(new Candidato("Davi ", 10, 20));
        lista.add(new Candidato("Bernardo ", 9, 10));
        lista.add(new Candidato("Lucas Matheus ", 10, 50));

        // Critério de ordenação
        Comparator<Candidato> criterio = Comparator.comparing(Candidato::getNotaTecnica).
                thenComparing(Candidato::getAnoExperiencia).reversed().
                thenComparing(Candidato::getNome);

        // ordenação a lista
        lista.sort(criterio);


         lista.forEach(candidato -> System.out.println(candidato));

    }
}
