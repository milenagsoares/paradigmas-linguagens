class Matematica:
    @staticmethod
    def fatorial(n):
        if n < 0:
            return None
        if n == 0 or n == 1:
            return 1
        resultado = 1
        for i in range(2, n + 1):
            resultado *= i
        return resultado

if __name__ == "__main__":
    numero = 5
    print(f"Fatorial de {numero}: {Matematica.fatorial(numero)}")
