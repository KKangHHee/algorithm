while True:
    low, high = 1, 10
    dishonest = False
    
    while True:
        number = int(input()) 
        if number == 0:
            exit() 
        
        response = input().strip()  
        
        if response == "too high":
            high = min(high, number - 1)
        elif response == "too low":
            low = max(low, number + 1)
        elif response == "right on":
            if not (low <= number <= high):
                dishonest = True
            break 
        
    print("Stan is dishonest" if dishonest else "Stan may be honest")
