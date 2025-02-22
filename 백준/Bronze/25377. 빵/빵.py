minN = -1
for _ in range(int(input())):
    A ,B = map(int, input().split())
    size = B - A
    if size >= 0:
        minN = min(minN, B)
print(minN)
        