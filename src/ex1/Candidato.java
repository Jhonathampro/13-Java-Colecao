package ex1;

public class Candidato {
    private String nome;
    private double NotaTecnica;
    private int anoExperiencia;

    public Candidato(String nome, double notaTecnica, int anoExperiencia) {
        this.nome = nome;
        NotaTecnica = notaTecnica;
        this.anoExperiencia = anoExperiencia;
    }

    @Override
    public String toString() {
        return  String.format("Nome=%s | Notatecnica=%.1f | Anos de experiência=%d ",
                nome, NotaTecnica, anoExperiencia);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaTecnica() {
        return NotaTecnica;
    }

    public void setNotaTecnica(double notaTecnica) {
        NotaTecnica = notaTecnica;
    }

    public int getAnoExperiencia() {
        return anoExperiencia;
    }

    public void setAnoExperiencia(int anoExperiencia) {
        this.anoExperiencia = anoExperiencia;
    }
}
