import java.util.ArrayList;
import java.util.List;

class Empregado {
    private String nome;
    private String cargo;
    private double salario;

    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
}

class Empresa {
    private String nome;
    private List<Empregado> empregados;

    public Empresa(String nome) {
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }

    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public void exibirEmpregados() {
        System.out.println("Empregados da " + nome + ":");
        for (Empregado emp : empregados) {
            System.out.printf("Nome: %s, Cargo: %s, Salário: %.2f\n", emp.getNome(), emp.getCargo(), emp.getSalario());
        }
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresa X");

        Empregado empregado1 = new Empregado("Alice", "Desenvolvedora", 5000);
        Empregado empregado2 = new Empregado("Bob", "Designer", 4000);

        empresa.adicionarEmpregado(empregado1);
        empresa.adicionarEmpregado(empregado2);

        empresa.exibirEmpregados();
    }
}
