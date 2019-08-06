N = int(input())
f = int(1)
if N == 0:
    f = 1
else:
    for i in range(N):
        f = (i + 1) * f
f = str(f)
count = 0
i = len(f)
while f[i - 1] == "0":
    count += 1
    i -= 1

print(count)