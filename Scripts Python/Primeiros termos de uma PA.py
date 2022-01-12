'''
# Com for:
inicio = int(input("Primeiro termo: "))
razao = int(input("Razão: "))
qtd_termos = int(input("Número de termos: "))
decimo_termo = inicio + ((qtd_termos - 1) * razao)
for i in range(inicio, decimo_termo+1, razao):
    print(i, end=" -> ")
else:
    print("ACABOU")
'''

# Com while:
inicio = int(input("Primeiro termo: "))
razao = int(input("Razão: "))
qtd_termos = int(input("Número de termos: "))
termo_n = inicio + ((qtd_termos - 1) * razao)
i = inicio
while i < termo_n + 1:
    print(i, end=" -> ")
    i += razao
print("ACABOU")