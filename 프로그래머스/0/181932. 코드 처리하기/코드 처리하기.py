def solution(code):
    mode = 0
    idx = 0
    answer = '' # ret
    for i in code:
        if mode == 0:
            if i != '1' and idx % 2 == 0:
                answer += i
            elif i == '1':
                mode = 1 - mode
        else:
            if i != '1' and idx % 2 != 0:
                answer += i
            elif i == '1':
                mode = 1 - mode
        idx += 1
        
    if len(answer) == 0:
        return "EMPTY"
            
    return answer