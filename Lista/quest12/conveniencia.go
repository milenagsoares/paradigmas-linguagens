package main

import "fmt"

type Produto struct {
	Nome  string
	Preco float64
}

func (p Produto) Somar(outro Produto) Produto {
	return Produto{
		Nome:  "Combo de " + p.Nome + " e " + outro.Nome,
		Preco: p.Preco + outro.Preco,
	}
}

func main() {
	produto1 := Produto{"Produto A", 30.00}
	produto2 := Produto{"Produto B", 20.00}
	produtoCombo := produto1.Somar(produto2)

	fmt.Printf("%s: R$%.2f\n", produtoCombo.Nome, produtoCombo.Preco)
}
