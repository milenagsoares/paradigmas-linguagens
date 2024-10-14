package main

import (
	"errors"
	"fmt"
)

type Carro struct {
	marca  string
	modelo string
	ano    int
}

func NewCarro(marca, modelo string, ano int) (*Carro, error) {
	if marca == "" || modelo == "" || ano < 1886 {
		return nil, errors.New("dados inválidos")
	}
	return &Carro{marca: marca, modelo: modelo, ano: ano}, nil
}

func (c *Carro) SetMarca(marca string) error {
	if marca == "" {
		return errors.New("marca não pode ser vazia")
	}
	c.marca = marca
	return nil
}

func (c *Carro) SetModelo(modelo string) error {
	if modelo == "" {
		return errors.New("modelo não pode ser vazio")
	}
	c.modelo = modelo
	return nil
}

func (c *Carro) SetAno(ano int) error {
	if ano < 1886 {
		return errors.New("ano inválido")
	}
	c.ano = ano
	return nil
}

func (c Carro) String() string {
	return fmt.Sprintf("Carro [Marca: %s, Modelo: %s, Ano: %d]", c.marca, c.modelo, c.ano)
}

func main() {
	carro1, _ := NewCarro("Toyota", "Corolla", 2020)
	carro2, _ := NewCarro("Honda", "Civic", 2021)
	carro3, _ := NewCarro("Ford", "Mustang", 2022)

	fmt.Println(carro1)
	fmt.Println(carro2)
	fmt.Println(carro3)

	carro1.SetMarca("Chevrolet")
	carro1.SetModelo("Onix")
	carro1.SetAno(2019)
	fmt.Println(carro1)

	if err := carro2.SetAno(1800); err != nil {
		fmt.Println("Erro:", err)
	}
}
