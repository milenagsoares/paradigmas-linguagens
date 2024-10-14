package main

import (
	"fmt"
)

// SaldoInsuficienteError é um erro personalizado
type SaldoInsuficienteError struct {
	Saldo     float64
	ValorSaque float64
}

func (e *SaldoInsuficienteError) Error() string {
	return fmt.Sprintf("Saldo insuficiente: R$%.2f para o saque de R$%.2f", e.Saldo, e.ValorSaque)
}

type ContaBancaria struct {
	Titular string
	Saldo   float64
}

func (c *ContaBancaria) Sacar(valor float64) error {
	if valor > c.Saldo {
		return &SaldoInsuficienteError{Saldo: c.Saldo, ValorSaque: valor}
	}
	c.Saldo -= valor
	return nil
}

func main() {
	conta := ContaBancaria{Titular: "João", Saldo: 100.00}

	if err := conta.Sacar(150.00); err != nil {
		fmt.Println(err)
	}
}
