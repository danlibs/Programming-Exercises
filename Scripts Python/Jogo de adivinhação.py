from random import randint

numero = randint(0, 10)
print(numero)
palpite = int(input("Pensei em um número aleatório de 0 a 10. Que número eu pensei? "))
tentativas = 1
jogar = 'S'

while palpite != numero and jogar == 'S':
    print("ERROU!!!")
    jogar = input("Quer tentar de novo? [S/N] ").strip().upper()
    if jogar ==  'S':
        palpite = int(input("Então, em que número eu pensei? "))
        tentativas += 1
if jogar != 'S':
    print("Arregou!")
if palpite == numero:
    print("Caramba, você acertou! Pensei no número {} e você teve um total de {} tentativas".format(numero, tentativas))    
        
    