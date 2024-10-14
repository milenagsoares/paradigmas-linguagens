class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma de 2 números: " + calc.somar(5, 10));
        System.out.println("Soma de 3 números: " + calc.somar(5, 10, 15));
    }
}
