class Calculadora:
    def somar_dois(self, a, b):
        return a + b

    def somar_tres(self, a, b, c):
        return a + b + c

if __name__ == "__main__":
    calc = Calculadora()

    print("Soma de 2 números:", calc.somar_dois(5, 10))
    print("Soma de 3 números:", calc.somar_tres(5, 10, 15))
