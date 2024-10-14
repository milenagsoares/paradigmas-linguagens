public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar(int valor) {
        this.velocidade += valor;
    }

    public void frear(int valor) {
        if (this.velocidade - valor < 0) {
            this.velocidade = 0;
        } else {
            this.velocidade -= valor;
        }
    }

    public void exibirVelocidade() {
        System.out.println("Velocidade atual: " + this.velocidade + " km/h");
    }

    public void exibirDetalhes() {
        System.out.println("Carro [Marca: " + this.marca + ", Modelo: " + this.modelo + ", Ano: " + this.ano + "]");
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        carro1.exibirDetalhes();

        carro1.acelerar(50);
        carro1.exibirVelocidade();

        carro1.frear(20);
        carro1.exibirVelocidade();

        carro1.frear(40);
        carro1.exibirVelocidade();
    }
}
