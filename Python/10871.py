N, X = map(int, input().split())
A = list(map(int, input().split()))
result = ""

for i in range(N):
    if A[i] < X:
        result += str(A[i]) + " "

print(result)