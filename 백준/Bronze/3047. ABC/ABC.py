num1, num2, num3 = sorted(map(int, input().split())) ## sorted :: 정렬
order = input().strip().upper()
print(*[str({'A': num1, 'B': num2, 'C': num3}[x]) for x in order])