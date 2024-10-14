package main

import "fmt"

type Motor struct {
	Marca    string
	Potencia int
}

type Carro struct {
	Modelo string
	Motor  Motor
}

func (c Carro) ExibirDetalhes() {
	fmt.Printf("Modelo: %s, Motor: %s, Potência: %d cv\n", c.Modelo, c.Motor.Marca, c.Motor.Potencia)
}

func main() {
	motor := Motor{Marca: "Honda", Potencia: 150}
	carro := Carro{Modelo: "Civic", Motor: motor}
	carro.ExibirDetalhes()
}
