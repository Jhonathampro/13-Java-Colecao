package ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Aluno> turmaBd = new HashSet<>();
        turmaBd.add(new Aluno(10, "Matheus", "BD"));
        turmaBd.add(new Aluno(10, "Lucas", "BD"));
        turmaBd.add(new Aluno(15, "Selmini", "BD"));

        // LIsta de alunos matriculados em estruturas de dados
        Set<Aluno> TurmaEd = new HashSet<>();
        turmaBd.add(new Aluno(50, "F", "F"));
        turmaBd.add(new Aluno(20, "B", "B"));
        turmaBd.add(new Aluno(30, "D", "D"));

        turmaBd.forEach(Aluno -> System.out.println(Aluno));




    }
}
