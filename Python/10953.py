a = int(input())
for i in range(a):
    b, c = map(int, input().split(',')) #입력받은 값을 ','를 기준으로 나눔.
    print(b + c)