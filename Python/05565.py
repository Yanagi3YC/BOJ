lst = []
for i in range(10):
    lst.append(int(input()))
rst = lst[0]
for i in range(9):
    rst -= lst[i + 1]
print(rst)