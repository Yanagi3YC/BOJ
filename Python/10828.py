N = int(input())
stk = []

for i in range(N):
    cmd = list(input().split())
    if cmd[0] == "push":
        stk.append(int(cmd[1]))
    elif cmd[0] == "pop":
        if len(stk) == 0: print(-1)
        else: print(stk.pop())
    elif cmd[0] == "size":
        print(len(stk))
    elif cmd[0] == "empty":
        if len(stk) == 0: print(1)
        else: print(0)
    elif cmd[0] == "top":
        if len(stk) == 0: print(-1)
        else: print(stk[-1])