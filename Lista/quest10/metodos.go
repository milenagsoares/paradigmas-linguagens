package main

import "fmt"

type Calculadora struct{}

func (c Calculadora) SomarDois(a, b int) int {
	return a + b
}

func (c Calculadora) SomarTres(a, b, c int) int {
	return a + b + c
}

func main() {
	calc := Calculadora{}

	fmt.Println("Soma de 2 números:", calc.SomarDois(5, 10))
	fmt.Println("Soma de 3 números:", calc.SomarTres(5, 10, 15))
}
