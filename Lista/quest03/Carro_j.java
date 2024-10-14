public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 1000);

        conta.depositar(500);
        System.out.println("Saldo após depósito: " + conta.getSaldo());

        if (conta.sacar(200)) {
            System.out.println("Saldo após saque: " + conta.getSaldo());
        } else {
            System.out.println("Erro ao sacar");
        }

        if (!conta.sacar(1500)) {
            System.out.println("Erro ao sacar: saldo insuficiente");
        }
    }
}
