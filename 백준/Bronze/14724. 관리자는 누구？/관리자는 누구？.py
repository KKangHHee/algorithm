N = int(input())
club = ["PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"]

max_club, max_questions = "", -1
for c in club:
    max_n = max(list(map(int, input().split())))
    if max_n > max_questions: 
        max_questions = max_n
        max_club = c

print(max_club)  
