import java.util.ArrayList;
import java.util.List;

class Professor {
    private String nome;
    private List<Escola> escolas;

    public Professor(String nome) {
        this.nome = nome;
        this.escolas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Escola> getEscolas() {
        return escolas;
    }

    public void adicionarEscola(Escola escola) {
        this.escolas.add(escola);
    }
}

class Escola {
    private String nome;
    private List<Professor> professores;

    public Escola(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void adicionarProfessor(Professor professor) {
        this.professores.add(professor);
        professor.adicionarEscola(this);
    }
}

public class Main {
    public static void main(String[] args) {
        Escola escola1 = new Escola("Escola A");
        Escola escola2 = new Escola("Escola B");

        Professor professor1 = new Professor("Professor X");
        Professor professor2 = new Professor("Professor Y");

        escola1.adicionarProfessor(professor1);
        escola1.adicionarProfessor(professor2);
        escola2.adicionarProfessor(professor1);

        System.out.print("Professores da " + escola1.getNome() + ": ");
        for (Professor p : escola1.getProfessores()) {
            System.out.print(p.getNome() + " ");
        }
        System.out.println();

        System.out.print("Escolas do " + professor1.getNome() + ": ");
        for (Escola e : professor1.getEscolas()) {
            System.out.print(e.getNome() + " ");
        }
    }
}
