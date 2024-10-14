def inserir_cpf():
    return input("Digite o CPF (somente números): ")

def validar_cpf(cpf):
    cpf = ''.join(filter(str.isdigit, cpf))
    return cpf if len(cpf) == 11 else None

def mascara_cpf(cpf):
    return f"{cpf[:3]}.{cpf[3:6]}***-{cpf[9:]}"

def main():
    cpf = inserir_cpf()
    cpf_valido = validar_cpf(cpf)
    if cpf_valido:
        cpf_mascarado = mascara_cpf(cpf_valido)
        print("CPF sem máscara:", cpf)
        print("CPF com máscara:", cpf_mascarado)
    else:
        print("CPF inválido!")

if __name__ == "__main__":
    main()
