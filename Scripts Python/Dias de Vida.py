dia_n = int(input("Dia do nascimento: "))
mes_n = int(input("Mês do nascimento: "))
ano_n = int(input("Ano do nascimento: "))

dia_a = int(input("Dia atual: "))
mes_a = int(input("Mês atual: "))
ano_a = int(input("Ano atual: "))

total_dias = 0
while dia_n != dia_a or mes_n != mes_a or ano_n != ano_a:
  dia_n += 1
  total_dias += 1
  if dia_n > 30:
    dia_n = 1
    mes_n += 1
    if mes_n > 12:
      mes_n = 1
      ano_n += 1

print(f"Total de dias de vida: {total_dias}")
      