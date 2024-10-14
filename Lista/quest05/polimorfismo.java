import java.util.ArrayList;
import java.util.List;

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
    public static void emitirSom(List<Animal> animais) {
        for (Animal animal : animais) {
            animal.som();
        }
    }

    public static void main(String[] args) {
        // Criação dos objetos
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        // Lista de animais
        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(gato);

        // Chamada da função polimórfica
        emitirSom(animais);
    }
}
