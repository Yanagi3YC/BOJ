N = int(input())
lst = []
for i in range(N):
    lst.append(input())
for i in range(len(lst)):
    streak = int(0)
    score = int(0)
    for j in range(len(lst[i])):
        if lst[i][j] == "O":
            score += 1 + streak
            streak += 1
        else: streak = 0
    print(score)