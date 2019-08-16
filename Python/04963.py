w = 1
h = 1
while w != 0 or h != 0:
    w, h = map(int, input().split())
    lst = []
    for i in range(h):
        lst.append([])
    for i in range(h):
        lst[i] = list((map(int, input().split())))
    for i in range(h):
        print(lst[i])
    print()