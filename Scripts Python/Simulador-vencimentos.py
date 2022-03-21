# Cálculo da base
base_atual = float(input("Base atual: "))
base = base_atual * 1.334

# Escolaridade
gratificacao_escolaridade = base * 0.8

# Triênios
porc_trienio = float(input("Porcentagem de triênio: "))

# Titularidade
valor_atual_titularidade = float(input("Valor atual da gratificação de titularidade: "))
gartificacao_titularidade = valor_atual_titularidade * 1.104

# Aulas suplementares
qtd_jornada = int(input("Quantidade da jornada [100/150/200]: "))
qtd_aula_suplementar = float(input("Quantas horas de aula suplementar: "))
valor_aulas_suplementares = (base / qtd_jornada) * qtd_aula_suplementar

# Total + tempo de serviço
soma1 = base + gartificacao_titularidade + gratificacao_escolaridade
adicional_tempo_servico = (porc_trienio / 100) * soma1

# Auxílio alimentação
auxilio_alimentacao = 1000

# Gratificação de magistério
gratificacao_magisterio = float(input("Valor da sua gratificação de magistério: "))

# Transporte
auxilio_transporte = float(input("Valor do auxílio transporte: "))

# Vantagem pessoal
vantagem_pessoal = float(input("Valor da vantagem pessoal: "))

# Cálculo do salário bruto
salario_bruto = soma1 + adicional_tempo_servico + auxilio_alimentacao + valor_aulas_suplementares + gratificacao_magisterio + auxilio_transporte + vantagem_pessoal

# Previdência e IR
soma2 = soma1 + gratificacao_magisterio + vantagem_pessoal + adicional_tempo_servico
previdencia = soma2 * 0.14
ir = soma2 * 0.275

print("Salário bruto: {:.2f}".format(salario_bruto)) 
print("Salário líquido: {:.2f}".format(salario_bruto - previdencia - ir))