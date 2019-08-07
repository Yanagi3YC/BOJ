N = int(input())
lst = list(map(int, input().split()))
lst.sort()
M = lst[-1]
sum = 0
for i in range(len(lst)):
    lst[i] = (lst[i] / M) * 100
for i in range(len(lst)):
    sum += lst[i]
print(sum / N)