def changeValue(value, unit):
    if unit == 'kg': 
        return value * 2.2046, 'lb'
    elif unit == 'lb':
        return value * 0.4536, 'kg'
    elif unit == 'l':
        return value * 0.2642, 'g'
    elif unit == 'g':
        return value * 3.7854, 'l'

T = int(input())
for _ in range(T):
    value, unit = input().split()
    value = float(value)
    changedValue, changedUnit = changeValue(value, unit)
    print(f"{changedValue:.4f} {changedUnit}")
