public class Carro {
   
    private String marca;
    private String modelo;
    private int ano;

    
    public Carro() {
        this.marca = "Desconhecida";
        this.modelo = "Desconhecido";
        this.ano = 0;
    }

    
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 1885) { // O primeiro carro foi criado em 1886
            this.ano = ano;
        } else {
            System.out.println("Ano inválido. Por favor, insira um ano após 1885.");
        }
    }

    /
    @Override
    public String toString() {
        return "Carro [Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + "]";
    }

    public static void main(String[] args) {
        // Instanciando objetos utilizando o construtor parametrizado
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2021);
        Carro carro3 = new Carro("Ford", "Mustang", 2022);

        // Exibindo detalhes utilizando o método toString()
        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);

        // Exemplo de uso dos setters
        Carro carro4 = new Carro();
        carro4.setMarca("Chevrolet");
        carro4.setModelo("Onix");
        carro4.setAno(2019);
        System.out.println(carro4);

        carro4.setAno(1800); 
    }
}
