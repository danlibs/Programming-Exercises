import unicodedata

palavra = "Daniel Libonati Gomes"
for letra in palavra:
  print(bin(ord(letra))[2:], end=" ")
  print(unicodedata.normalize('NFKD', letra).encode('ascii', 'ignore').decode())