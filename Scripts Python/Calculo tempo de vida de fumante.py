cigarros_por_dia = int(input("Quantos cigarros você fuma por dia? "))
dias_fumando = int(input("Há quantos anos você fuma? ")) * 365
tempo_dia_perdido = (cigarros_por_dia * 10) / 1440 # 1440 é a quantidade de minutos em um dia
tempo_total_perdido = tempo_dia_perdido * dias_fumando
print("Você perdeu aproximadamente {} dias de vida.".format(int(tempo_total_perdido)))

