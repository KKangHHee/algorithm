# [Silver V] 그룹 단어 체커 - 1316 

[문제 링크](https://www.acmicpc.net/problem/1316) 

### 성능 요약

메모리: 14208 KB, 시간: 104 ms

### 분류

구현, 문자열

### 제출 일자

2025년 12월 22일 16:33:52

### 문제 설명

<p>그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.</p>

<p>단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.</p>

### 출력 

 <p>첫째 줄에 그룹 단어의 개수를 출력한다.</p>

## 🧩 문제 요약

> 그룹 단어: 단어에 존재하는 모든 문자에 대해, 각 문자가 연속해서 나타는 경우만.
→ 한번 나온 알파벳이 이후에 또 나오면 그룹 단어가 아님.
> 

---

## 🧠 접근 방법 (How I Thought)

- 처음 접근:
- 실패/막힌 지점:
- 정답 방향 전환 포인트:

---

## 📍 풀이 코드 (Mine)

```java
// 나의 풀이 코드 here
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        // 1) 입력 값 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); // n
        
        int count = 0; // 그룹 단어의 개수
        for(int i=0; i<num; i++){
            if(checkFn(br.readLine())){
                count++;
            }
        }
        
        // 메모리 누수 방지
        br.close();
        System.out.println(count);
    }
    
    private static boolean checkFn(String str){
        boolean[] alpha = new boolean[26]; // 26자의 알파벳
        int pre = -1; // 연속으로 나오는 것 확인용
        
        for(int i=0; i<str.length(); i++){
            int now = str.charAt(i) - 'a';
            
            if(pre != now){
                if (alpha[now]) {
                    return false;
                }
                alpha[now] = true;
                pre = now;
            }
        }    
        return true; 
    }
}
```

### 🎯 정답 코드 / 개선된 코드

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    // 1) 알파벳의 개수를 상수로 관리
    private static final int ALPHABET_SIZE = 26;
    
    public static void main(String[] args) throws IOException{
        // 2) try 구문을 통해 close() 자동 호출(java 7+)
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            int answer = 0;
            
            for(int i=0; i<n; i++){
                if(isGroupWord(br.readLine())){
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }
    
    private static boolean isGroupWord(String str){
        // 방어 구문
        if(str == null || str.isEmpty()) return true;
        
        boolean[] visited = new boolean[ALPHABET_SIZE];
        
        // 첫 문자 먼저 처리
        int prev = str.charAt(0) - 'a';
        visited[prev] = true;
                
        for(int i=1; i<str.length(); i++){
            int now = str.charAt(i) - 'a';
            
            if(prev != now){
                if(visited[now]) return false;
                
                visited[now] = true;
                prev = now;
            }
        }    
        return true; 
    }
}
```

---
