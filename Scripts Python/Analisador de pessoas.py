soma_idades = 0
homemvelho = ''
idadehomemvelho = 0
mulheresnovas = 0

for i in range(1, 5):
    print("======{}ª PESSOA======".format(i))
    nome = input("Informe o nome: ")
    idade = int(input("Informe a idade: "))
    sexo = input("Sexo (M/F): ").upper()
    print("-"*10)
    
    soma_idades += idade
    if sexo == 'M' and idade > idadehomemvelho:
        idadehomemvelho = idade
        homemvelho = nome
    if sexo == 'F' and idade < 20:
        mulheresnovas += 1

mediaidades = soma_idades / 4
print("A média de idade do grupo é de {} anos.".format(mediaidades))
print("O homem mais velho tem {} anos e se chama {}.".format(idadehomemvelho, homemvelho))
print("Ao todo são {} mulheres com menos de 20 anos.".format(mulheresnovas))
