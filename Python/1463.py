a = int(input())
count = 0

while a != 1:
    if a % 3 == 0:
        a /= 3
        count += 1
    elif a % 2 == 0:
        a /= 2
        count += 1
    else:
        a -= 1
        count += 1

print(count)