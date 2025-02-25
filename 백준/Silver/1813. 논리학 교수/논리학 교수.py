## k개의 참이 있을 때, k개의 조건이 참이되는지 확인, 없다면 -1
N = int(input())
conditions = list(map(int, input().split())) 

for k in range(N, -1, -1): ## n~ -1까지 n번
    count = sum(1 for x in conditions if x == k)
    if count == k:  # 정확히 k개의 말이 참이면
        print(k)
        break
else:
    print(-1) 
