t = int(input())
for _ in range(t):
    n, m = map(int, input().split())
    a_list = sorted(list(map(int, input().split())))
    b_list = sorted(list(map(int, input().split())))
    
    count = 0
    i = 0
    for a in a_list:
        while i < m:
            if a > b_list[i]:
                i += 1
            else:
                count += i
                break
        else:
            count += m
    print(count)
