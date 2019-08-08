N = int(input())
count = int(0)
clone_N = N

A = (clone_N // 10)
B = (clone_N % 10)
clone_N = B * 10 + (A + B) % 10
count += 1

while clone_N != N:
    A = (clone_N // 10)
    B = (clone_N % 10)
    clone_N = B * 10 + (A + B) % 10
    count += 1

print(count)