def solution(arr):
    if len(arr) >= 2:
        arr.remove(min(arr))
        return arr
    else:
        return [-1]
