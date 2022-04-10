print("Informe qual temperatura deseja converter: ")
print("[1] Celsius")
print("[2] Fahrenheint")
print("[3] Kelvin")
print("[0] Sair")
opcao = input()
if opcao == "1":
    print("Converter de celsius para: ")
    print("[1] Fahrenheint")
    print("[2] Kelvin")
    opcao = input()
    if opcao == "1":
        celsius = float(input("Temperatura em celsius: "))
        fahrenheint = ((9 * celsius) / 5) + 32
        print("{:.2f}º C = {:.2f}º F".format(celsius, fahrenheint))
    elif opcao == "2":
        celsius = float(input("Temperatura em celsius: "))
        kelvin = celsius + 273.15
        print("{:.2f}º C = {:.2f}º K".format(celsius, kelvin))
elif opcao == "2":
    print("Converter de fahrenheint para: ")
    print("[1] Celsius")
    print("[2] Kelvin")
    opcao = input()
    if opcao == "1":
        fahrenheint = float(input("Temperatura em fahrenheint: "))
        celsius = ((fahrenheint - 32) / 9) * 5
        print("{:.2f}º F = {:.2f}º C".format(fahrenheint, celsius))
    elif opcao == "2":
        fahrenheint = float(input("Temperatura em fahrenheint: "))
        kelvin = ((fahrenheint - 32) / 9) * 5 + 273.15
        print("{:.2f}º F = {:.2f}º K".format(fahrenheint, kelvin))
elif opcao == "3":
    print("Converter de kelvin para: ")
    print("[1] Celsius")
    print("[2] Fahrenheint")
    opcao = input()
    if opcao == "1":
        kelvin = float(input("Temperatura em kelvin: "))
        celsius = kelvin - 273.15
        print("{:.2f}º K = {:.2f}º C".format(kelvin, celsius))
    elif opcao == "2":
        kelvin = float(input("Temperatura em kelvin: "))
        fahrenheint = ((kelvin - 273.15) / 5) * 9 + 32
        print("{:.2f}º F = {:.2f}º K".format(fahrenheint, kelvin))