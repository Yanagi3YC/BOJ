a = int(input())
lst = list(map(int, input().split()))
count = 0
for i in lst:
    if i == a:
        count += 1
print(count)