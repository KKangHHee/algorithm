N = int(input())  # 후보자의 수
votes = []
count = 0

for _ in range(N):
    votes.append(int(input()))

if N == 1:
    print(count)
else:
    dasom = votes[0] 
    other_votes = votes[1:] 
    other_votes.sort(reverse=True)

    while True:
        if other_votes[0] < dasom:
            break
        other_votes[0] -= 1 
        dasom += 1
        count += 1
        other_votes.sort(reverse=True)

    print(count)
