n = int(input())
sNum = input()

cNum = list(sNum)
sum = 0

for i in range(len(cNum)):
    sum += int(cNum[i])
print(sum)