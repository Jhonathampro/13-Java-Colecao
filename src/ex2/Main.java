package ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Aluno> turmaBd = new HashSet<>();
        turmaBd.add(new Aluno(10, "F", "BD"));
        turmaBd.add(new Aluno(20, "Selmini", "BD"));
        turmaBd.add(new Aluno(60, "Sel", "BD"));

        // LIsta de alunos matriculados em estruturas de dados
        Set<Aluno> TurmaEd = new HashSet<>();
        TurmaEd.add(new Aluno(10, "F", "FI"));
        TurmaEd.add(new Aluno(20, "B", "B"));
        TurmaEd.add(new Aluno(30, "D", "D"));

        // lista de todos os alunos matriculados
        System.out.println("Alunos matriculados na duas disciplinas");
        Set<Aluno>  uniao = new HashSet<>(turmaBd);
        uniao.addAll(TurmaEd);

        uniao.forEach(Aluno -> System.out.println(Aluno));

        // Lista dos alunos matriculados nas duas disciplinas
        System.out.println("\nAlunos matriculados na duas disciplinas");
        Set<Aluno> nasDuas = new HashSet<>(turmaBd);
        nasDuas.retainAll(TurmaEd);
        nasDuas.forEach(Aluno -> System.out.println(Aluno));

        System.out.println("\nAlunos matriculados apenas em banco de dados");
        Set<Aluno> soBd = new HashSet<>(turmaBd);
        soBd.removeAll(TurmaEd);
        soBd.forEach(Aluno -> System.out.println(Aluno));
    }
}
