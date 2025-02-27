## 조건 1) 두 단어의 첫 글자와 마지막 글자는 서로 동일해야 한다.
## 조건 2) 각 단어에서 모음(a, e, i, o, u)을 제거한 문자열은 동일
from collections import Counter

def check_vowels(s1, s2):
    return s1[0] == s2[0] and s1[-1] == s2[-1] ## 조건 1

def remove_vowels(s):
    vowels = 'aeiou'
    return ''.join([char for char in s if char not in vowels])
    
def comparison(s1, s2):
    if check_vowels(s1, s2) and remove_vowels(s1) == remove_vowels(s2):
        if Counter(s1) == Counter(s2): ## 조건 3
            return "YES"
    return "NO"

N = int(input())
string1 = input()
string2 = input()
print(comparison(string1, string2))

        
    