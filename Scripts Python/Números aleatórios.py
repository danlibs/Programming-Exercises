from random import randint

numeros = randint(0, 9), randint(0, 9), randint(0, 9), randint(0, 9), randint(0, 9)

for n in numeros:
    print(n, end=" ")

print("\nO maior número sorteado foi {} e o menor foi {}.".format(max(numeros), min(numeros)))    
