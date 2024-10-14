class Motor:
    def __init__(self, marca, potencia):
        self.marca = marca
        self.potencia = potencia

class Carro:
    def __init__(self, modelo, motor):
        self.modelo = modelo
        self.motor = motor

    def exibir_detalhes(self):
        print(f"Modelo: {self.modelo}, Motor: {self.motor.marca}, Potência: {self.motor.potencia} cv")

if __name__ == "__main__":
    motor = Motor("Honda", 150)
    carro = Carro("Civic", motor)
    carro.exibir_detalhes()
