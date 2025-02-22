## 입력 값이 커서 재귀보다는 반복문으로 헤결 필요
def factory(n):
    result = 1
    for i in range(2, n+1):
        result *= i
    return result

print(factory(int(input())))
