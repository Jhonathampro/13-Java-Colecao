import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<>();
        lista.add(new Aluno(10,"Davy Bernardo", "SI"));
        lista.add(new Aluno(11,"DLucas Matheus", "Banco de dados"));
        lista.add(new Aluno(12,"Juliana Nickolas", "ADM"));

        // Impressão da lista usando lambda
        lista.forEach(aluno -> {
            System.out.println(aluno);

        });
       // ordenando os alunos
        lista.sort(Comparator.comparing(Aluno::getNome)
                  .thenComparing(Aluno::getCurso));

        System.out.println("======================================");
        // Impressão da lista usando lambda
        lista.forEach(aluno -> {
            System.out.println(aluno);

        });


    }
}
