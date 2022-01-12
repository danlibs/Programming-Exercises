unidade = input("Você gostaria de converter de Celsius para Fahrenheit (digite 1) ou de Fahrenheit para Celsius (digite 2)? ")
if unidade == "1":
    celsius = float(input("Informe o valor da temperatura em Celsius: "))
    conversao = 9 * (celsius / 5) + 32
    print("{} ºC é equivalente a {} ºF.".format(celsius, conversao))
elif unidade == "2":
    fahrenheit = float(input("Informe o valor da temperatura em Fahrenheit: "))
    conversao = ((fahrenheit - 32) / 9) * 5
    print("{} ºF é equivalente a {} ºC.".format(fahrenheit, conversao))

