## 첫째 줄 :데이터 개수 N, 질의 개수 M
## 둘째 줄 : 데이터 배열 , 각 수는 0 <= num <=1000
## 셋째~M 줄: 합을 구하는 구간 i~j 1 ≤ i ≤ j ≤ N


## 일반 input 사용 시, 시간초과 sys 이용
import sys

input = sys.stdin.read
data = input().splitlines()

N, M = map(int, data[0].split())

L = list(map(int, data[1].split()))
S = [0] * (N + 1) ## S[N+1]
for i in range(1, N+1):
    S[i] = S[i-1] + L[i -1]

result = []
for k in range(2, 2 + M):
    i, j = map(int, data[k].split())
    result.append(str(S[j] - S[i - 1]))

sys.stdout.write("\n".join(result) + "\n")
