valor = int(input("Informe um número: "))
maior = valor
menor = valor
opcao = input("Quer adicionar outro valor? [s/n] ").lower().strip()
soma = valor
qtd_valores = 1
while opcao == 's':
    valor = int(input("Informe um número: "))
    if valor > maior:
        maior = valor
    elif valor < menor:
        menor = valor
    soma += valor
    qtd_valores += 1
    opcao = input("Quer adicionar outro valor? [s/n] ").lower().strip()
print("Números informados: {}".format(qtd_valores))
print("Menor valor: {}".format(menor))
print("Maior valor: {}".format(maior))
print("Média aritmética: {}".format(soma/qtd_valores))