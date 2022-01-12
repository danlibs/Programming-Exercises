nome = input("Digite o nome: ")
primeiro = nome.split()[0]
ultimo = nome.split()[len(nome.split())-1]
print(primeiro + "\n" + ultimo)  
