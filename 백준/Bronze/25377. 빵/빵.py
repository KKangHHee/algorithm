minN = 1001
for _ in range(int(input())):
    A ,B = map(int, input().split())
    if A <= B:
        minN = min(minN, B)
print(-1 if minN == 1001 else minN)
        