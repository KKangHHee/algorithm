import math

## 순서가 있는 경우의 수 구하기
## C(M,N) = M!/N!(M-N)!
T = int(input())
for _ in range(T):
    N, M = map(int, input().split())
    result = math.comb(M, N)
    print(result)
    