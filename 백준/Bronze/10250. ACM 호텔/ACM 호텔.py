testTry = int(input())  

for i in range(testTry):  
    h, w, n = map(int, input().split())
    
    point = 0 
    found = False

    for j in range(1, w + 1): 
        for k in range(1, h + 1): 
            point += 1
            if point == n:
                print(f"{k}{str(j).zfill(2)}") 
                found = True 
                break
        if found:
            break
