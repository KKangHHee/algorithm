N = int(input())  # 테스트 개수
for _ in range(N):
    r, e, c = map(int, input().split())
    profit = e - c 
    if r < profit:
        print("advertise")
    elif r == profit:
        print("does not matter")
    else:
        print("do not advertise")
