soma = 0
for x in range(1, 7):
    numero = int(input("Digite o {}º número: ".format(x))) 
    if numero % 2 == 0:
        soma += numero
print(soma)