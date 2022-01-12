numero = int(input("Digite um número: "))
qtd_divisivel = 0
for i in range(1, numero+1):
    if numero % i == 0:
        qtd_divisivel += 1
        print("\033[0;32m{}\033[m".format(i), end=" ")
    else:
        print("\033[0;31m{}\033[m".format(i), end=" ")
print("O número {} foi divisível {} vezes.".format(numero, qtd_divisivel))
if qtd_divisivel == 2:
    print("{} é primo!".format(numero))
else:
    print("{} NÃO é primo!".format(numero))  
