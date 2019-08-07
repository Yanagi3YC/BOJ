N = int(input())
lst = list(map(int, input().split()))
lst.sort()
print("%d " %lst[0] + "%d" %lst[-1])