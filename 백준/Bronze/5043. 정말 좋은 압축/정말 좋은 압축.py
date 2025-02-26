## n개의 비트일때, 2^(n+1)-1개 -> b가 표현할 수 있는 최대 비트

N, b = map(int, input().split())
print("yes" if N <= 2**(b+1) - 1 else "no")