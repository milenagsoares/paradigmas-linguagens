def inserir_placa():
    return input("Digite a placa do seu veículo: ")

def validar_placa(placa):
    return len(placa) == 7 and placa[:3].isalpha() and placa[3:].isdigit()

def mascarar_placa(placa):
    return f"{placa[:3]}-{placa[3:]}"

def filtrar_placa(placa):
    return placa[:2] + "***" + placa[-2:]

def main():
    placa = inserir_placa()
    if validar_placa(placa):
        print("Placa válida!")
        print("Placa do veículo:", mascarar_placa(placa))
        print("Placa do veículo com máscara:", filtrar_placa(placa))
    else:
        print("Placa inválida!")

if __name__ == "__main__":
    main()
