A = int(input())
A *= int(input())
A *= int(input())
A = str(A)
lst = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
for i in range(len(A)):
    lst[int(A[i])] += 1
for i in range(10):
    print(lst[i])