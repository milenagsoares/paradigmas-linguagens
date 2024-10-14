package main

import (
	"fmt"
	"sync"
)

type Configuracao struct {
	config map[string]string
}

var (
	instancia *Configuracao
	once      sync.Once
)

func GetInstancia() *Configuracao {
	once.Do(func() {
		instancia = &Configuracao{
			config: make(map[string]string),
		}
	})
	return instancia
}

func (c *Configuracao) SetConfig(chave, valor string) {
	c.config[chave] = valor
}

func (c *Configuracao) GetConfig(chave string) string {
	return c.config[chave]
}

func main() {
	config1 := GetInstancia()
	config1.SetConfig("usuario", "admin")

	config2 := GetInstancia()
	fmt.Println(config2.GetConfig("usuario")) // Saída: admin
	fmt.Println(config1 == config2)             // Saída: true
}
