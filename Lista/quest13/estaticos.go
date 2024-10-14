package main

import "fmt"

type Matematica struct{}

func Fatorial(n int) int {
    if n < 0 {
        return -1 // Indica que o fatorial não é definido para números negativos
    }
    resultado := 1
    for i := 2; i <= n; i++ {
        resultado *= i
    }
    return resultado
}

func main() {
    numero := 5
    fmt.Printf("Fatorial de %d: %d\n", numero, Fatorial(numero))
}
