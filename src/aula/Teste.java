package aula;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<>();
        lista.add(new Aluno(10,"Davy Bernardo", "SI"));
        lista.add(new Aluno(11,"Lucas Matheus", "Banco de dados"));
        lista.add(new Aluno(12,"Juliana Nickolas", "ADM"));

        // Impressão da lista usando lambda
        lista.forEach(aluno -> {
            System.out.println(aluno);

        });
       // ordenando os alunos
        lista.sort(Comparator.comparing(Aluno::getNome)
                  .thenComparing(Aluno::getCurso));
        // sort: é o macanismo que eu faço para fazer a odenação, ele não sabe como ordenar
        // com objetos complexos, ele apenas organiza conforme os critérios
        // comparator: ele é a interface onde aplico os métodos de comparação
        // comparing: ele é o método da inteface comparetor, ele serve para quando o objeto tem vários
        // atributos e quero fazer a ordenação, ai eu passo especificamente o que ele deve ordenar.
        // .thenComparing: ele serve para quando o primeiro comparing da empate, então faço outro critério
        // de ordenação, e posso fazer um monte se for nécessario.


        System.out.println("======================================");
        // Impressão da lista usando lambda
        lista.forEach(aluno -> {
            System.out.println(aluno);

        });


    }
}
