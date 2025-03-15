def fibonacci():
    count_0 = [0] * 41 # 0 <= n <= 40
    count_1 = [0] * 41

    count_0[0] = 1 # fibonacci(0)
    count_1[1] = 1 # fibonacci(1)
    for i in range(2, 41):
        count_0[i] = count_0[i - 1] + count_0[i - 2]
        count_1[i] = count_1[i - 1] + count_1[i - 2]
    return count_0, count_1

count_0, count_1 = fibonacci()
T = int(input())
for _ in range(T):
    n = int(input())
    print(count_0[n], count_1[n])