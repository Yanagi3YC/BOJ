a = int(input())
if a == 1:
    print("*")
else:
    print((a - 1) * " " + "*")
    for i in range(a - 2):
      print((a - i - 2) * " " + "*" + (2 * (i + 1) - 1) *" " + "*")
    print((2 * a - 1) * "*")