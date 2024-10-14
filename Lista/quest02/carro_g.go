package main

import (
	"errors"
	"fmt"
)

type Carro struct {
	marca      string
	modelo     string
	ano        int
	velocidade int
}

func NewCarro(marca, modelo string, ano int) (*Carro, error) {
	if marca == "" || modelo == "" || ano < 1886 {
		return nil, errors.New("dados inválidos")
	}
	return &Carro{marca: marca, modelo: modelo, ano: ano, velocidade: 0}, nil
}

func (c *Carro) Acelerar(valor int) {
	c.velocidade += valor
}

func (c *Carro) Frear(valor int) {
	if c.velocidade-valor < 0 {
		c.velocidade = 0
	} else {
		c.velocidade -= valor
	}
}

func (c Carro) ExibirVelocidade() {
	fmt.Printf("Velocidade atual: %d km/h\n", c.velocidade)
}

func (c Carro) String() string {
	return fmt.Sprintf("Carro [Marca: %s, Modelo: %s, Ano: %d]", c.marca, c.modelo, c.ano)
}

func main() {
	carro1, _ := NewCarro("Toyota", "Corolla", 2020)

	fmt.Println(carro1)

	carro1.Acelerar(50)
	carro1.ExibirVelocidade()

	carro1.Frear(20)
	carro1.ExibirVelocidade()

	carro1.Frear(40)
	carro1.ExibirVelocidade()
}
