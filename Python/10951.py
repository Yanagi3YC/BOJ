try:
    while True:
        a, b = map(int, input().split())
        print(a + b)
except:
    exit() #프로그램을 종료한다는 뜻.

#try 이하의 코드를 실행하는 중 오류 발생 시 except 이하의 코드를 실행하는 예외처리법.