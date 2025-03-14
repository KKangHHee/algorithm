
import sys

s = sys.stdin.readline().strip() 
zero_count, one_count = 0, 0

if s[0] == '0':
    zero_count += 1
else:
    one_count += 1

for i in range(1, len(s)):
    if s[i] != s[i-1]:
        if s[i] == '0':
            zero_count += 1
        else:
            one_count += 1

print(min(zero_count, one_count))
    