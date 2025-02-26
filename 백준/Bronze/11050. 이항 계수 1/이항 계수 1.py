## 이항 계수 
## (n/k) = nCk = nC(n-k) = n!/(n-k)! * k!
## n!/(n-k)! = n*(n-1) ... *(n-k+1)
## 1<= N 10, 0<= k <= n

N, K = map(int, input().split())
K = min(K, N - K)
result = 1
for i in range(1, K+1):
    result *= (N-K+i) ## n*(n-1) ... *(n-k+1)
    result //= i ## k!
    
print(result)