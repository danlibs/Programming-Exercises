palavra = input("Frase: ")
binario = ""
#print(" ".join(format(ord(x), 'b') for x in palavra))

for letra in palavra:
  binario += bin(ord(letra))[2:] + " "
  
print("Código binário: {}".format(binario))
  

