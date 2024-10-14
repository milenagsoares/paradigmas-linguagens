class Configuracao:
    _instancia = None

    def __new__(cls):
        if cls._instancia is None:
            cls._instancia = super(Configuracao, cls).__new__(cls)
            cls._instancia.inicializar()
        return cls._instancia

    def inicializar(self):
        self.config = {}

    def set_config(self, chave, valor):
        self.config[chave] = valor

    def get_config(self, chave):
        return self.config.get(chave, None)

if __name__ == "__main__":
    config1 = Configuracao()
    config1.set_config("usuario", "admin")

    config2 = Configuracao()
    print(config2.get_config("usuario"))  # Saída: admin
    print(config1 is config2)  # Saída: True
