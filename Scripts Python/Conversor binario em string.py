binario = input("Código binário: ")
texto = ""

for codigo in binario.split():
  texto += chr(int(codigo, 2))

print("Texto decodificado: {}".format(texto))