valor1 = int(input("Informe um número: "))
valor2 = int(input("Informe outro número: "))

opcao = 0
while opcao != 5:
    print("[1] somar")
    print("[2] multiplicar")
    print("[3] maior que")
    print("[4] novos números")
    print("[5] sair do programa")
    opcao = int(input("O que você quer fazer? "))
    if opcao == 1:
        soma = valor1 + valor2
        print("A soma dos números é: {}\n".format(soma))
    elif opcao == 2:
        multiplicacao = valor1 * valor2
        print("A multiplicação dos números é: {}\n".format(multiplicacao))
    elif opcao == 3:
        if valor1 > valor2:
            print("{} é maior que {}.\n".format(valor1, valor2))
        else:
            print("{} NÃO é maior que {}.\n".format(valor1, valor2))   
    elif opcao == 4:
        valor1 = int(input("Informe um novo valor: "))   
        valor2 = int(input("Informe outro novo valor: "))     
    