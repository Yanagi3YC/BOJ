a = str(input())
lst = []
lst.append(a[0])
for i in range(len(a)):
    if a[i] == '-':
        lst.append(a[i + 1])
result = str()
for i in lst:
    result += i
print(result)