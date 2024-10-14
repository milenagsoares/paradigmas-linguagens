class SaldoInsuficienteException(Exception):
    def __init__(self, saldo, valor_saque):
        self.saldo = saldo
        self.valor_saque = valor_saque
        super().__init__(f"Saldo insuficiente: R${saldo:.2f} para o saque de R${valor_saque:.2f}")

class ContaBancaria:
    def __init__(self, titular, saldo_inicial):
        self.titular = titular
        self.saldo = saldo_inicial

    def sacar(self, valor):
        if valor > self.saldo:
            raise SaldoInsuficienteException(self.saldo, valor)
        self.saldo -= valor

if __name__ == "__main__":
    conta = ContaBancaria("João", 100.00)
    
    try:
        conta.sacar(150.00)
    except SaldoInsuficienteException as e:
        print(e)
