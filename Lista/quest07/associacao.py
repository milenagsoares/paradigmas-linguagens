class Professor:
    def __init__(self, nome):
        self.nome = nome
        self.escolas = []

    def adicionar_escola(self, escola):
        self.escolas.append(escola)

class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.professores = []

    def adicionar_professor(self, professor):
        self.professores.append(professor)
        professor.adicionar_escola(self)

if __name__ == "__main__":
    escola1 = Escola("Escola A")
    escola2 = Escola("Escola B")

    professor1 = Professor("Professor X")
    professor2 = Professor("Professor Y")

    escola1.adicionar_professor(professor1)
    escola1.adicionar_professor(professor2)
    escola2.adicionar_professor(professor1)

    print(f"Professores da {escola1.nome}: ", end="")
    for p in escola1.professores:
        print(p.nome, end=" ")
    print()

    print(f"Escolas do {professor1.nome}: ", end="")
    for e in professor1.escolas:
        print(e.nome, end=" ")
