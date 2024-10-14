class Animal:
    def som(self):
        raise NotImplementedError("Este método deve ser sobrescrito")

class Cachorro(Animal):
    def som(self):
        return "Au Au"

class Gato(Animal):
    def som(self):
        return "Miau"

def emitir_som(animais):
    for animal in animais:
        print(animal.som())

if __name__ == "__main__":
    # Criação dos objetos
    cachorro = Cachorro()
    gato = Gato()

    # Lista de animais
    animais = [cachorro, gato]

    # Chamada da função polimórfica
    emitir_som(animais)
