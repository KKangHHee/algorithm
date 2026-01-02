# [Silver V] 영화감독 숌 - 1436 

[문제 링크](https://www.acmicpc.net/problem/1436) 

### 성능 요약

메모리: 85892 KB, 시간: 264 ms

### 분류

브루트포스 알고리즘

### 제출 일자

2026년 1월 2일 22:44:58

### 문제 설명

<p>666은 종말을 나타내는 수라고 한다. 따라서, 많은 블록버스터 영화에서는 666이 들어간 제목을 많이 사용한다. 영화감독 숌은 세상의 종말 이라는 시리즈 영화의 감독이다. 조지 루카스는 스타워즈를 만들 때, 스타워즈 1, 스타워즈 2, 스타워즈 3, 스타워즈 4, 스타워즈 5, 스타워즈 6과 같이 이름을 지었고, 피터 잭슨은 반지의 제왕을 만들 때, 반지의 제왕 1, 반지의 제왕 2, 반지의 제왕 3과 같이 영화 제목을 지었다. 하지만 숌은 자신이 조지 루카스와 피터 잭슨을 뛰어넘는다는 것을 보여주기 위해서 영화 제목을 좀 다르게 만들기로 했다.</p>

<p>종말의 수란 어떤 수에 6이 적어도 3개 이상 연속으로 들어가는 수를 말한다. 제일 작은 종말의 수는 666이고, 그 다음으로 큰 수는 1666, 2666, 3666, .... 이다. 따라서, 숌은 첫 번째 영화의 제목은 "세상의 종말 666", 두 번째 영화의 제목은 "세상의 종말 1666"와 같이 이름을 지을 것이다. 일반화해서 생각하면, N번째 영화의 제목은 세상의 종말 (N번째로 작은 종말의 수) 와 같다.</p>

<p>숌이 만든 N번째 영화의 제목에 들어간 수를 출력하는 프로그램을 작성하시오. 숌은 이 시리즈를 항상 차례대로 만들고, 다른 영화는 만들지 않는다.</p>

### 입력 

 <p>첫째 줄에 N이 주어진다. N은 10,000보다 작거나 같은 자연수이다.</p>

### 출력 

 <p>첫째 줄에 N번째 영화의 제목에 들어간 수를 출력한다.</p>

 ---
 ## 📍 풀이 코드 (Mine)

```java
// 나의 풀이 코드 here
// 입력1) n(~10,000)
// 규칙) 제목: "세상의 종말 x", 이때 x는 666이 들어가는 n번째로 작은 수
// 출력1) x를 출력

import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            
            int count = 0; // 완탐 기준
            int x = 666; // 시작값
            
            while(true){
                if(String.valueOf(x).contains("666")){
                    count++;
                    if(count == n){
                        System.out.print(x);
                        break;
                    }
                }
                x++;
            }
        }
    }
}

```

### 🎯 정답 코드 / 개선된 코드

```java
// 베스트 풀이 or 리팩토링 코드

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            int count = 0;
            int x = 666;

            while (true) {
                // 숫자 연산을 통해 666 포함 여부 확인 (문자열 변환 X)
                if (has666(x)) {
                    count++;
                    if (count == n) {
                        System.out.print(x);
                        break;
                    }
                }
                x++;
            }
        }
    }

    // 숫자를 10으로 나눠가며 연속된 6이 3번 나오는지 체크
    private static boolean has666(int num) {
        int continuousSix = 0;
        while (num > 0) {
            if (num % 10 == 6) {
                continuousSix++;
                if (continuousSix == 3) return true;
            } else {
                continuousSix = 0; // 연속성이 깨지면 초기화
            }
            num /= 10;
        }
        return false;
    }
}
```

---

