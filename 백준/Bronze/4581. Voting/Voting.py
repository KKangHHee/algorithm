## Y: 찬성, N: 반대, P: 투표하지 않음, A: 결석
## 절반 이상이 결석하면 쿼럼이 부족하므로 "need quorum"
## 쿼럼이 충분하면 "yes", "no", "tie" 
## "#"입력 전까지 반복

while True:
    vote = input()
    if vote == "#": break
    y = vote.count("Y")
    n = vote.count("N")
    
    if vote.count("A") >= len(vote) / 2:
        print("need quorum")

    else:
        print("yes" if y > n
              else "no" if y < n
              else "tie")
