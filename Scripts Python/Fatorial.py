print("---CÁLCULO DE FATORIAL---")
n = abs(int(input("Informe um número: ")))
fat = 1
i = n
#Com for:
for i in range(n, 0, -1):
    fat *= i
    print(("{} x " if i > 1 else "1 = ").format(i), end="")
print(fat)

# Com while:
#print("{}! = ".format(n),end="")
#while i > 0:
#    fat *= i
#    print(("{} x " if i > 1 else "1 = ").format(i), end="")
#    i -= 1
#print(fat)
