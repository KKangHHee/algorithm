num1, num2, num3 = sorted(map(int, input().split())) ## sorted :: 정렬
order = input().strip().upper()
print(order.replace('A', str(num1)+" ").replace('B', str(num2)+" ").replace('C', str(num3)+" "))
