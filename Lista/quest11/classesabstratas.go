package main

import "fmt"

type Funcionario interface {
	CalcularSalario() float64
}

type FuncionarioHorista struct {
	HorasTrabalhadas float64
	ValorHora        float64
}

func (f FuncionarioHorista) CalcularSalario() float64 {
	return f.HorasTrabalhadas * f.ValorHora
}

type FuncionarioAssalariado struct {
	SalarioMensal float64
}

func (f FuncionarioAssalariado) CalcularSalario() float64 {
	return f.SalarioMensal
}

func main() {
	var funcionario Funcionario

	funcionario = FuncionarioHorista{HorasTrabalhadas: 40, ValorHora: 15.00}
	fmt.Printf("Salário do Funcionário Horista: %.2f\n", funcionario.CalcularSalario())

	funcionario = FuncionarioAssalariado{SalarioMensal: 3000.00}
	fmt.Printf("Salário do Funcionário Assalariado: %.2f\n", funcionario.CalcularSalario())
}
