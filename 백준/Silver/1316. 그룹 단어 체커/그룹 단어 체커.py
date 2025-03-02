## 연속된 글자가 같은 글자면 그룹임(continue)
## 이후 입력에 예전 그룹화된 글자가 나오면 그룹이 아니므로 -1
N = int(input())
count = N
for _ in range(N):
    word = input()
    appeared_words = set() 
    prev_char = ''
    
    for i in range (len(word)):
        if word[i] != prev_char: 
            if word[i] in appeared_words:
                count -= 1
                break
            appeared_words.add(prev_char)
        prev_char = word[i]
print(count)
