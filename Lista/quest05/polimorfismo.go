package main

import "fmt"

// Interface Animal
type Animal interface {
	Som() string
}

// Estrutura base
type Cachorro struct{}

func (c Cachorro) Som() string {
	return "Au Au"
}

type Gato struct{}

func (g Gato) Som() string {
	return "Miau"
}

// Função polimórfica
func EmitirSom(animais []Animal) {
	for _, animal := range animais {
		fmt.Println(animal.Som())
	}
}

func main() {
	// Criação dos objetos
	cachorro := Cachorro{}
	gato := Gato{}

	// Lista de animais
	animais := []Animal{cachorro, gato}

	// Chamada da função polimórfica
	EmitirSom(animais)
}
