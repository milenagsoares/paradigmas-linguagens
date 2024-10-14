package main

import "fmt"

type Imprimivel interface {
	Imprimir()
}

type Relatorio struct {
	Titulo string
}

func (r Relatorio) Imprimir() {
	fmt.Println("Imprimindo Relatório:", r.Titulo)
}

type Contrato struct {
	ParteA string
	ParteB string
}

func (c Contrato) Imprimir() {
	fmt.Printf("Imprimindo Contrato entre %s e %s\n", c.ParteA, c.ParteB)
}

func main() {
	var documentos []Imprimivel

	documentos = append(documentos, Relatorio{Titulo: "Relatório Anual"})
	documentos = append(documentos, Contrato{ParteA: "Empresa A", ParteB: "Empresa B"})

	for _, doc := range documentos {
		doc.Imprimir()
	}
}
