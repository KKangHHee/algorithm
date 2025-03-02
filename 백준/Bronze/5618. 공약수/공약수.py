import math

n = int(input())
nums = list(map(int, input().split()))

if n == 2:
    gcd_value = math.gcd(nums[0], nums[1]) ## 각 수의 최대 공약수를 구함
else:
    gcd_value = math.gcd(math.gcd(nums[0], nums[1]), nums[2])

divisors = set()
for i in range(1, int(math.sqrt(gcd_value)) + 1):
    if gcd_value % i == 0:
        divisors.add(i)
        divisors.add(gcd_value // i)

for divisor in sorted(divisors):
    print(divisor)
    
    