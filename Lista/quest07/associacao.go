package main

import "fmt"

type Professor struct {
	Nome     string
	Escolas  []*Escola
}

type Escola struct {
	Nome      string
	Professores []*Professor
}

func (e *Escola) AdicionarProfessor(p *Professor) {
	e.Professores = append(e.Professores, p)
	p.Escolas = append(p.Escolas, e)
}

func main() {
	escola1 := &Escola{Nome: "Escola A"}
	escola2 := &Escola{Nome: "Escola B"}

	professor1 := &Professor{Nome: "Professor X"}
	professor2 := &Professor{Nome: "Professor Y"}

	escola1.AdicionarProfessor(professor1)
	escola1.AdicionarProfessor(professor2)
	escola2.AdicionarProfessor(professor1)

	fmt.Printf("Professores da %s: ", escola1.Nome)
	for _, p := range escola1.Professores {
		fmt.Printf("%s ", p.Nome)
	}
	fmt.Println()

	fmt.Printf("Escolas do %s: ", professor1.Nome)
	for _, e := range professor1.Escolas {
		fmt.Printf("%s ", e.Nome)
	}
}
