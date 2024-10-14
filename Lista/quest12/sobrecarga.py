class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    def __add__(self, other):
        if isinstance(other, Produto):
            return Produto("Combo de " + self.nome + " e " + other.nome, self.preco + other.preco)
        return NotImplemented

    def __str__(self):
        return f"{self.nome}: R${self.preco:.2f}"

if __name__ == "__main__":
    produto1 = Produto("Produto A", 30.00)
    produto2 = Produto("Produto B", 20.00)
    produto_combo = produto1 + produto2

    print(produto_combo)
