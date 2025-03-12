N, M = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
total = 0

for i in range(max(N, M)):
    score_a = a[i] if i < N else 0
    score_b = b[i] if i < M else 0
    
    if score_b > score_a:
        total = max(total,score_b - score_a)
        
print(total)