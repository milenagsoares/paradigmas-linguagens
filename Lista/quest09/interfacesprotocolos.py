from abc import ABC, abstractmethod

class Imprimivel(ABC):
    @abstractmethod
    def imprimir(self):
        pass

class Relatorio(Imprimivel):
    def __init__(self, titulo):
        self.titulo = titulo

    def imprimir(self):
        print(f"Imprimindo Relatório: {self.titulo}")

class Contrato(Imprimivel):
    def __init__(self, parte_a, parte_b):
        self.parte_a = parte_a
        self.parte_b = parte_b

    def imprimir(self):
        print(f"Imprimindo Contrato entre {self.parte_a} e {self.parte_b}")

if __name__ == "__main__":
    documentos = [
        Relatorio("Relatório Anual"),
        Contrato("Empresa A", "Empresa B")
    ]

    for doc in documentos:
        doc.imprimir()
