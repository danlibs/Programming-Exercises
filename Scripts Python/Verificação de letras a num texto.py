frase = input("Frase: ")
qtd_de_a = frase.count('a')
primeira_aparicao = frase.find('a')
ultima_aparicao = frase.rfind('a')
print("A quantidade de letras 'a' no seu texto é {}, sendo a primeira aparição na posição {} e a última na posição {}."
      .format(qtd_de_a, primeira_aparicao, ultima_aparicao))
