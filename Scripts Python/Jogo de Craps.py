from random import randint
import time

def jogar_dados():
    print("Você joga os dados!")
    for x in range(3):
        print(".")
        time.sleep(0.4)
    numero = randint(2, 12)
    return numero 


def resultado(primeira_rodada, valor_dado, ponto=0):
    print(f"Você tirou {valor_dado}!")
    if primeira_rodada:
        if numero == 7 or numero == 11:
            print('Você é um "natural" e ganhou o jogo! PARABÉNS!')
            return 1
        elif numero == 2 or numero == 3 or numero == 12:
            print('Eita... Deu "craps" e você perdeu. Até mais.')
            return 0
        else:
            print(f'{valor_dado} é o seu "ponto", você precisa tirá-lo novamente para vencer o jogo.')
            print("Mas agora, se tirar 7, perde!")
            return valor_dado
    else:
        if numero == 7:
            print("Deu azar! Infelizmente você perdeu.")
            return 0
        elif numero == ponto:
            print("Parabéns, você venceu!!!")
            return 1
        else:
            print("Sem resultado definido. Você deve jogar de novo.")
            return 2

 
print(5*"-"+"BEM-VINDO(A) AO JOGO DE CRAPS"+5*"-")
opcao = ""
primeira_rodada = True
tentativas = 1

while opcao != "1" and opcao != "2":
    print("Escolha uma opção:")
    print("[1] Jogar")
    print("[2] Sair")
    opcao = input("Opção: ")
if opcao == "2":
    print("Adeus!")
else:
    jogar = ""
    ponto = 0
    while jogar != "N":
        if not primeira_rodada:
            while jogar != "S" and jogar != "N":
                jogar = input("Quer jogar de novo? [S/N] ").upper()
            if jogar == "N":
                print("Até mais.")
                break
            numero = jogar_dados()
            res = resultado(primeira_rodada, numero, ponto)
            tentativas += 1
            if res <= 1:
                print(f"Número de jogadas: {tentativas}")
                break
            jogar = ""
        else:
            numero = jogar_dados()
            res = resultado(primeira_rodada, numero)
            if res <= 1:
                break
            elif res > 1:
                ponto = res
            primeira_rodada = False
        
        
        
 