S = int(input())
Sum = 0
for i in range(1,S+1):
    Sum += i
    if(S == Sum):
        print(i)
        break
    elif(S < Sum):
        print(i-1)
        break