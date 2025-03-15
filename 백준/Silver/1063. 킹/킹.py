command = {
    'R': (1, 0),   
    'L': (-1, 0),  
    'B': (0, -1),   
    'T': (0, 1),  
    'RT': (1, 1), 
    'LT': (-1, 1),
    'RB': (1, -1),  
    'LB': (-1, -1)  
}
def pos(x, y):
    x = ord(x)-ord('A')
    y = int(y) -1
    return x, y

def move_piece(pos, direction):
    x, y = pos
    dx, dy = command[direction]
    new_x, new_y = x + dx, y + dy

    if 0<=new_x<8 and 0<=new_y<8: # 체스판의 크기 0~7
        return new_x, new_y
    else: # 벗어나면 제자리에 가만히 
        return pos

king_pos, stone_pos, N = input().split() # 킹, 돌, 횟수
king_x, king_y = pos(king_pos[0], king_pos[1])
stone_x, stone_y = pos(stone_pos[0], stone_pos[1])
N = int(N)

for _ in range(N):
    move = input().strip()
    new_king_x, new_king_y = move_piece((king_x, king_y), move) # king 움직임

    # 돌이 길막하면 
    if new_king_x == stone_x and new_king_y == stone_y:
        new_stone_x, new_stone_y = move_piece((stone_x, stone_y), move) # 돌을 이동
        
        if not(new_stone_x == stone_x and new_stone_y == stone_y): # 돌이 벗어나기 때문에 멈추지 않을 경우에 이동
            king_x, king_y = new_king_x, new_king_y
            stone_x, stone_y = new_stone_x, new_stone_y
            
    else:
        king_x, king_y = new_king_x, new_king_y

king_pos = f"{chr(king_x + ord('A'))}{king_y + 1}"
stone_pos = f"{chr(stone_x + ord('A'))}{stone_y + 1}"
print(king_pos)
print(stone_pos)
    
