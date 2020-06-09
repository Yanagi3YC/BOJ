lst = []
MAX = int(0)
for i in range(9):
    lst.append(int(input()))
for i in range(9):
    count = 0
    for j in range(9):
        if lst[i] - lst[j] > 0:
            count += 1
    if count == 8:
        MAX = i
        break

print(lst[i])
print(i + 1)