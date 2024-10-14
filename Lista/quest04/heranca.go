package main

import "fmt"

// Interface que define o comportamento comum
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

func main() {
	var animal Animal

	animal = Cachorro{}
	fmt.Println("Cachorro:", animal.Som())

	animal = Gato{}
	fmt.Println("Gato:", animal.Som())
}
