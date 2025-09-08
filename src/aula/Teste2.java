package aula;

import java.util.HashSet;
import java.util.Set;

public class Teste2 {
    public static void main(String[] args) {
        Set<Aluno> lista = new HashSet<>();
        // set: é uma interface que serve para não ter dados duplicados
        // HashSet: é uma classe concreta que implemeta a ideia de não ter
        // dados duplicados

        lista.add(new Aluno(10,"Davy Bernardo", "SI"));
        lista.add(new Aluno(11,"DLucas Matheus", "Banco de dados"));
        lista.add(new Aluno(12,"Juliana Nickolas", "ADM"));
        lista.add(new Aluno(12,"Juventus", "Time"));

        // Impressão da lista usando lambda
        lista.forEach(aluno -> {
            System.out.println(aluno);

        });

    }
}
