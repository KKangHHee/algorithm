N = int(input())
count = 0

if N < 3:
    print(0)
else:
    for i in range(1, N+1):
        for j in range(i, N+1):
            sum_ij = i + j
            k = N - sum_ij
        
            if k < sum_ij: # 삼각형 빗변이 양변의 합보다 작을 때 삼각형 성립
                if k < j:
                    break
                count += 1
            else:
                continue
    print(count)