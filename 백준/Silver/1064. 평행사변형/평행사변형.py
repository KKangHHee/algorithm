Ax, Ay, Bx, By, Cx, Cy = map(int, input().split())
# 두 쌍의 대변이 각각 평행
# 두 쌍의 대변의 길이가 각각 동일
# 두 쌍의 대각의 크기가 각각 동일
# 두 대각선이 서로 다른 것을 이등분

if ((Ax-Bx)*(Ay-Cy)==(Ay-By)*(Ax-Cx)): # 세 점이 일직선 상에 있으면 -1
    print(-1.0)
    exit(0)
ab_length = ((Ax-Bx)**2 + (Ay-By)**2)**0.5
ac_length = ((Ax-Cx)**2 + (Ay-Cy)**2)**0.5
bc_length = ((Bx-Cx)**2 + (By-Cy)**2)**0.5

# 둘레이기 때문에 *2 -> 마지막에 모아서 처리로
length = [ab_length+ac_length, ab_length+bc_length, ac_length+bc_length]

result = max(length) - min(length)

print(2*result)