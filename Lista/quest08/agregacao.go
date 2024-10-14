package main

import "fmt"

type Empregado struct {
	Nome  string
	Cargo string
	Salario float64
}

type Empresa struct {
	Nome      string
	Empregados []Empregado
}

func (e *Empresa) AdicionarEmpregado(emp Empregado) {
	e.Empregados = append(e.Empregados, emp)
}

func (e Empresa) ExibirEmpregados() {
	fmt.Printf("Empregados da %s:\n", e.Nome)
	for _, emp := range e.Empregados {
		fmt.Printf("Nome: %s, Cargo: %s, Salário: %.2f\n", emp.Nome, emp.Cargo, emp.Salario)
	}
}

func main() {
	empresa := Empresa{Nome: "Empresa X"}

	empregado1 := Empregado{Nome: "Alice", Cargo: "Desenvolvedora", Salario: 5000}
	empregado2 := Empregado{Nome: "Bob", Cargo: "Designer", Salario: 4000}

	empresa.AdicionarEmpregado(empregado1)
	empresa.AdicionarEmpregado(empregado2)

	empresa.ExibirEmpregados()
}
