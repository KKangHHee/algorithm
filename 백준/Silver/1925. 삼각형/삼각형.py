def sum_squares(x, y):
    return x**2 + y**2

Ax, Ay = map(int, input().split())
Bx, By = map(int, input().split())
Cx, Cy = map(int, input().split())


if (Bx - Ax) * (Cy - Ay) == (By - Ay) * (Cx - Ax): # 세 점이 일직선 위에 있는지 확인
    print("X")
else:
    AB2 = sum_squares(Bx - Ax, By - Ay)
    AC2 = sum_squares(Cx - Ax, Cy - Ay)
    BC2 = sum_squares(Cx - Bx, Cy - By)
    
    # 정삼각형
    if AB2 == AC2 == BC2:
        print("JungTriangle")
    # 이등변 삼각형
    elif AB2 == AC2 or AC2 == BC2 or AB2 == BC2:
        # 둔각이등변삼각형
        if AB2 + AC2 < BC2 or AC2 + BC2 < AB2 or AB2 + BC2 < AC2:
            print("Dunkak2Triangle")
        # 직각이등변삼각형
        elif AB2 + AC2 == BC2 or AC2 + BC2 == AB2 or AB2 + BC2 == AC2:
            print("Jikkak2Triangle")
        # 예각이등변삼각형
        else:
            print("Yeahkak2Triangle")
            
    # 세 변이 다른 경우
    else:
        # 둔각삼각형
        if AB2 + AC2 < BC2 or AC2 + BC2 < AB2 or AB2 + BC2 < AC2:
            print("DunkakTriangle")
        # 직각삼각형
        elif AB2 + AC2 == BC2 or AC2 + BC2 == AB2 or AB2 + BC2 == AC2:
            print("JikkakTriangle")
        # 예각삼각형
        else:
            print("YeahkakTriangle")
