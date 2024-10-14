class ContaBancaria:
    def __init__(self, titular, saldo_inicial):
        self.__titular = titular
        self.__saldo = saldo_inicial

    def depositar(self, valor):
        if valor > 0:
            self.__saldo += valor

    def sacar(self, valor):
        if valor > 0 and valor <= self.__saldo:
            self.__saldo -= valor
            return True
        return False

    @property
    def saldo(self):
        return self.__saldo

if __name__ == "__main__":
    conta = ContaBancaria("João", 1000)

    conta.depositar(500)
    print(f"Saldo após depósito: {conta.saldo}")

    if conta.sacar(200):
        print(f"Saldo após saque: {conta.saldo}")
    else:
        print("Erro ao sacar")

    if not conta.sacar(1500):
        print("Erro ao sacar: saldo insuficiente")
