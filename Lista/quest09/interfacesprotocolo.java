interface Imprimivel {
    void imprimir();
}

class Relatorio implements Imprimivel {
    private String titulo;

    public Relatorio(String titulo) {
        this.titulo = titulo;
    }

    public void imprimir() {
        System.out.println("Imprimindo Relatório: " + titulo);
    }
}

class Contrato implements Imprimivel {
    private String parteA;
    private String parteB;

    public Contrato(String parteA, String parteB) {
        this.parteA = parteA;
        this.parteB = parteB;
    }

    public void imprimir() {
        System.out.printf("Imprimindo Contrato entre %s e %s\n", parteA, parteB);
    }
}

public class Main {
    public static void main(String[] args) {
        Imprimivel[] documentos = new Imprimivel[2];
        documentos[0] = new Relatorio("Relatório Anual");
        documentos[1] = new Contrato("Empresa A", "Empresa B");

        for (Imprimivel doc : documentos) {
            doc.imprimir();
        }
    }
}
