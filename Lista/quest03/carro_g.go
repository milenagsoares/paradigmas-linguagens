package main

import (
	"errors"
	"fmt"
)

type ContaBancaria struct {
	titular string
	saldo   float64
}

func NewContaBancaria(titular string, saldoInicial float64) *ContaBancaria {
	return &ContaBancaria{titular: titular, saldo: saldoInicial}
}

func (c *ContaBancaria) Depositar(valor float64) {
	if valor > 0 {
		c.saldo += valor
	}
}

func (c *ContaBancaria) Sacar(valor float64) error {
	if valor <= 0 {
		return errors.New("valor inválido para saque")
	}
	if valor > c.saldo {
		return errors.New("saldo insuficiente")
	}
	c.saldo -= valor
	return nil
}

func (c *ContaBancaria) GetSaldo() float64 {
	return c.saldo
}

func main() {
	conta := NewContaBancaria("João", 1000)

	conta.Depositar(500)
	fmt.Printf("Saldo após depósito: %.2f\n", conta.GetSaldo())

	if err := conta.Sacar(200); err != nil {
		fmt.Println("Erro ao sacar:", err)
	} else {
		fmt.Printf("Saldo após saque: %.2f\n", conta.GetSaldo())
	}

	if err := conta.Sacar(1500); err != nil {
		fmt.Println("Erro ao sacar:", err)
	}
}
