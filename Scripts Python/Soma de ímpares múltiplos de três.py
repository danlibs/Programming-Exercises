soma = 0
inicio = int(input("Informe o valor para iniciar a contagem: "))
fim = int(input("Informe o número para encerrar a contagem (não incluído!): "))
for x in range(inicio, fim):
    if x % 2 != 0 and x % 3 == 0:
        soma += x
print(soma)