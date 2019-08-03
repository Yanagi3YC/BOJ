C = int(input())
lst = []
for i in range(C):
    lst.append([])
for i in range(C):
    lst[i] = list(map(int,input().split()))
for i in range(C):
    sum = int(0)
    count = int(0)
    num = lst[i][0]
    for j in range(num):
        sum += lst[i][j + 1]
    avr = sum / num
    for k in lst[i][1:]:
        if k > avr: count += 1
    print("%.3f%%" %round(((count / num) * 100), 3))