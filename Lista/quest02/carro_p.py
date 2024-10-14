class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 0

    def acelerar(self, valor):
        self.velocidade += valor

    def frear(self, valor):
        if self.velocidade - valor < 0:
            self.velocidade = 0
        else:
            self.velocidade -= valor

    def exibir_velocidade(self):
        print(f"Velocidade atual: {self.velocidade} km/h")

    def exibir_detalhes(self):
        print(f"Carro [Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}]")

if __name__ == "__main__":
    carro1 = Carro("Toyota", "Corolla", 2020)
    carro1.exibir_detalhes()

    carro1.acelerar(50)
    carro1.exibir_velocidade()

    carro1.frear(20)
    carro1.exibir_velocidade()

    carro1.frear(40)
    carro1.exibir_velocidade()
