nome = input("Digite seu nome completo: ")
print("Analisando seu nome...")
print("Seu nome completo em maiúsculas é " + nome.upper())
print("Seu nome em minúsculas é " + nome.lower())
print("Seu nome tem ao todo {} letras".format(len(nome.replace(" ",""))))
primeiro_nome = nome[:nome.find(" ")]
print("Seu primeiro nome é {} e ele tem {} letras".format(primeiro_nome, len(primeiro_nome)))

