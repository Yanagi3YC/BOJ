A, B, C = map(int, input().split())
MAX = 0
if A - B >= 0 and A - C >= 0: MAX = A
elif B - C >= 0 and B - A >= 0: MAX = B
elif C - A >= 0 and C - B >= 0: MAX = C
if MAX == A:
    if B - C > 0: print(B)
    else: print(C)
elif MAX == B:
    if A - C > 0: print(A)
    else: print(C)
elif MAX == C:
    if A - B > 0: print(A)
    else: print(B)