class Motor {
    private String marca;
    private int potencia;

    public Motor(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public int getPotencia() {
        return potencia;
    }
}

class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void exibirDetalhes() {
        System.out.println("Modelo: " + modelo + ", Motor: " + motor.getMarca() + ", Potência: " + motor.getPotencia() + " cv");
    }

    public static void main(String[] args) {
        Motor motor = new Motor("Honda", 150);
        Carro carro = new Carro("Civic", motor);
        carro.exibirDetalhes();
    }
}
