class Animal:
    def som(self):
        raise NotImplementedError("Este método deve ser sobrescrito")

class Cachorro(Animal):
    def som(self):
        return "Au Au"

class Gato(Animal):
    def som(self):
        return "Miau"

if __name__ == "__main__":
    cachorro = Cachorro()
    gato = Gato()

    print("Cachorro:", cachorro.som())
    print("Gato:", gato.som())
