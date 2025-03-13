t = int(input())
for _ in range(t):
    n, a, b = map(int, input().split())
    min_binary = bin(min(a, b))
    find_min_index_1 = min_binary[::-1].index('1') # 1의 자리부터 셀 경우 처음 나오는 1의 위치 
    print(n-find_min_index_1)