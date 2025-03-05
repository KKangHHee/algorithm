N, M = map(int, input().split()) # 세로, 가로 크기
N_arr = []
for i in range(N-1):
    N_arr.insert(i, int(input()))
M_arr = list(map(int, input().split()))
N_arr.insert(N-1, M_arr[0])
a = N_arr.index(min(N_arr)) +1
b = M_arr.index(min(M_arr)) +1

print(a,b)