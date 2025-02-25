## 원래 빈병의 수 e, 
## 발견 빈병의 수 f
## 교체 필요에 필요 c

e, f, c = map(int, input().split())
totalBottle = e+f
totalDrink = 0

while totalBottle>=c:
    newDrink = totalBottle // c
    totalBottle = totalBottle % c + newDrink
    totalDrink += newDrink
    
print(totalDrink)