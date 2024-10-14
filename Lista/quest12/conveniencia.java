class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto somar(Produto outro) {
        return new Produto("Combo de " + this.nome + " e " + outro.nome, this.preco + outro.preco);
    }

    @Override
    public String toString() {
        return nome + ": R$" + String.format("%.2f", preco);
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto A", 30.00);
        Produto produto2 = new Produto("Produto B", 20.00);
        Produto produtoCombo = produto1.somar(produto2);

        System.out.println(produtoCombo);
    }
}
