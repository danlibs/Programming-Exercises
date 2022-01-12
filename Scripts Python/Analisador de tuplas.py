numeros = int(input("Digite um número: ")), int(input("Digite outro número: ")), int(input("Digite mais um número: ")), int(input("Digite só mais um número: "))
qtd_pares = 0
for n in numeros:
    if n % 2 == 0:
        qtd_pares += 1


print("O número 9 foi digitado {} vezes.".format(numeros.count(9)))
if numeros.count(3) >= 1:
    print("O número 3 aparece pela primeira vez na {}ª posição".format(numeros.index(3) + 1))
print("Foram digitados {} números pares.".format(qtd_pares))
