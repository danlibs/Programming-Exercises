nome = input("Qual seu nome? ")
novo_nome = ""
for x in range(len(nome) - 1, -1, -1):
    novo_nome += nome[x]
print(novo_nome)