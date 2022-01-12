a = float(input("Lado A: "))
b = float(input("Lado B: "))
c = float(input("Lado C: "))

if abs(b - c) < a and a < (b + c):
    if abs(a - c) < b and b < (a + c):
        if abs(a - b) < c and c < (a + b):
            if a == b and b == c:
                print("{}, {} e {} formam um triângulo equilátero!".format(a, b, c))
            elif (a == b and a != c) or (a == c and c != b) or (c == b and c != a):
                print("{}, {} e {} formam um triângulo isósceles!".format(a, b, c))
            else:
                print("{}, {} e {} formam um triângulo escaleno!".format(a, b, c))
else:
    print("{}, {} e {} não formam um triângulo...".format(a, b, c))
