def resultN(N):
    if N < 3:
        return 0
    count = 0
    for a in range(1, N // 3 + 1):
        for b in range(a, (N - a) // 2 + 1):
            c = N - a - b
            if a + b > c:
                count += 1
    return count

N = int(input())
print(resultN(N))