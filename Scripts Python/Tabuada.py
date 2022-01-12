numero = int(input("Digite um número para ver sua tabuada de multiplicação: "))
for x in range(1, 11):
    print("{} x {} = {}".format(numero, x, numero * x))