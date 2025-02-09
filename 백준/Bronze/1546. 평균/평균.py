## 최댓값 M, 과목의 수 N
## 점수/M * 100의 평균 -> 반환값은 float 타입

n = int(input())
arr = list(map(float,input().split(" ")))
print(sum(arr)*100/max(arr)/n)