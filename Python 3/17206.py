import sys
T = sys.stdin.readline()
lst = list(map(int, sys.stdin.readline().split()))
for i in range(len(lst)):
    c3 = lst[i] // 3
    c7 = lst[i] // 7
    c21 = lst[i] // 21
    sum3 = 3 * ((c3 ** 2) + c3) * 0.5
    sum7 = 7 * ((c7 ** 2) + c7) * 0.5
    sum21 = 21 * ((c21 ** 2) + c21) * 0.5
    print(int(sum3 + sum7 - sum21))