a = int(input())
for i in range(a):
    print(i * " " + ((a - i) * 2 - 1) * "*")
for i in range(a - 1):
    print((a - i - 2) * " " + (2 * (i + 2) - 1) * "*")