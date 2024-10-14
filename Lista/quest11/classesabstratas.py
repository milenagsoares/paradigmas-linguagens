from abc import ABC, abstractmethod

class Funcionario(ABC):
    @abstractmethod
    def calcular_salario(self):
        pass

class FuncionarioHorista(Funcionario):
    def __init__(self, horas_trabalhadas, valor_hora):
        self.horas_trabalhadas = horas_trabalhadas
        self.valor_hora = valor_hora

    def calcular_salario(self):
        return self.horas_trabalhadas * self.valor_hora

class FuncionarioAssalariado(Funcionario):
    def __init__(self, salario_mensal):
        self.salario_mensal = salario_mensal

    def calcular_salario(self):
        return self.salario_mensal

if __name__ == "__main__":
    horista = FuncionarioHorista(40, 15.00)
    assalariado = FuncionarioAssalariado(3000.00)

    print(f"Salário do Funcionário Horista: {horista.calcular_salario():.2f}")
    print(f"Salário do Funcionário Assalariado: {assalariado.calcular_salario():.2f}")
