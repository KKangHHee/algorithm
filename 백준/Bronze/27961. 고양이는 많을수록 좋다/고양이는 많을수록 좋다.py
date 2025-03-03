## 1, 2, 4, 8, 16, 32, ... 순 
## 일반항 :: N(k) = 2^(k-1)
## 2^(k-1) >= N 
## k >= log2(N)-1

import math

N = int(input())
if N == 0:
    print(0)
else:
    k = math.ceil(math.log2(N)) + 1
    print(k)
