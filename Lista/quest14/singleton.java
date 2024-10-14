class Configuracao {
    private static Configuracao instancia;

    private Configuracao() {
        // Inicialização da configuração
    }

    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public void setConfig(String chave, String valor) {
        // Lógica para definir configuração
    }

    public String getConfig(String chave) {
        // Lógica para obter configuração
        return "valor"; // Exemplo de retorno
    }
}

public class Main {
    public static void main(String[] args) {
        Configuracao config1 = Configuracao.getInstancia();
        config1.setConfig("usuario", "admin");

        Configuracao config2 = Configuracao.getInstancia();
        System.out.println(config2.getConfig("usuario")); // Saída: valor
        System.out.println(config1 == config2); // Saída: true
    }
}
