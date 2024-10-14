abstract class Animal {
    public abstract void som();
}

class Cachorro extends Animal {
    @Override
    public void som() {
        System.out.println("Au Au");
    }
}

class Gato extends Animal {
    @Override
    public void som() {
        System.out.println("Miau");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        cachorro.som();

        Animal gato = new Gato();
        gato.som();
    }
}
