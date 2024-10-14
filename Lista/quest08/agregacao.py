class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

class Empresa:
    def __init__(self, nome):
        self.nome = nome
        self.empregados = []

    def adicionar_empregado(self, empregado):
        self.empregados.append(empregado)

    def exibir_empregados(self):
        print(f"Empregados da {self.nome}:")
        for emp in self.empregados:
            print(f"Nome: {emp.nome}, Cargo: {emp.cargo}, Salário: {emp.salario:.2f}")

if __name__ == "__main__":
    empresa = Empresa("Empresa X")

    empregado1 = Empregado("Alice", "Desenvolvedora", 5000)
    empregado2 = Empregado("Bob", "Designer", 4000)

    empresa.adicionar_empregado(empregado1)
    empresa.adicionar_empregado(empregado2)

    empresa.exibir_empregados()
