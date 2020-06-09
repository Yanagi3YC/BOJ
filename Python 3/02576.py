lst = []
oddlst = []
for i in range(7):
    lst.append(int(input()))
for i in lst:
    if i % 2 == 1:
        oddlst.append(i)
if oddlst == [] : print(-1)
else:
    oddlst.sort()
    print(sum(oddlst))
    print(oddlst[0])