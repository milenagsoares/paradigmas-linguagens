class Matematica {
    public static int fatorial(int n) {
        if (n < 0) {
            return -1; // Indica que o fatorial não é definido para números negativos
        }
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Fatorial de " + numero + ": " + Matematica.fatorial(numero));
    }
}
