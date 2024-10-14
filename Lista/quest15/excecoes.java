class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(double saldo, double valorSaque) {
        super(String.format("Saldo insuficiente: R$%.2f para o saque de R$%.2f", saldo, valorSaque));
    }
}

class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException(saldo, valor);
        }
        saldo -= valor;
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 100.00);
        
        try {
            conta.sacar(150.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
