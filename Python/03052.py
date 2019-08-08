lst = []
for i in range(10):
    lst.append(int(input()) % 42)
for i in range(len(lst) - 1, 0, -1):
    if lst.index(lst[i]) != i:
        del lst[i]
print(len(lst))