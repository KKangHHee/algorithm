n = int(input())
nLength = int(len(str(n)))
result = 0

for i in range(1, nLength):
    result += 9 * (10 ** (i - 1)) * i
result += (n - (10 ** (nLength - 1)) + 1) * nLength
print(result)