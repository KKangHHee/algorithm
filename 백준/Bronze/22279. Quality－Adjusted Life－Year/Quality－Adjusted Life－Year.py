sum = 0.0
for _ in range(int(input())):
    q, y = map(float, input().split())
    sum += q*y
print(f"{sum:.3f}")