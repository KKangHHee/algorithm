# [Silver V] 집합 - 11723 

[문제 링크](https://www.acmicpc.net/problem/11723) 

### 성능 요약

메모리: 312716 KB, 시간: 1044 ms

### 분류

구현, 집합과 맵, 비트마스킹

### 제출 일자

2026년 1월 8일 21:21:09

### 문제 설명

<p>비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.</p>

<ul>
	<li><code>add x</code>: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.</li>
	<li><code>remove x</code>: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.</li>
	<li><code>check x</code>: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)</li>
	<li><code>toggle x</code>: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)</li>
	<li><code>all</code>: S를 {1, 2, ..., 20} 으로 바꾼다.</li>
	<li><code>empty</code>: S를 공집합으로 바꾼다.</li>
</ul>

### 입력 

 <p>첫째 줄에 수행해야 하는 연산의 수 M (1 ≤ M ≤ 3,000,000)이 주어진다.</p>

<p>둘째 줄부터 M개의 줄에 수행해야 하는 연산이 한 줄에 하나씩 주어진다.</p>

### 출력 

 <p><code>check</code> 연산이 주어질때마다, 결과를 출력한다.</p>
 ---
## 📍 풀이 코드 (Mine)

```java
// 나의 풀이 코드 here
// boolean[]
// boolean 배열

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            boolean[] arr = new boolean[21]; // 1~20
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            
             while(n-- >0){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String op = st.nextToken();
                switch(op){
                    case "add":
                        arr[Integer.parseInt(st.nextToken())] = true;
                        break;
                    case "remove":
                        arr[Integer.parseInt(st.nextToken())] = false;
                        break;
                    case "check":
                        sb.append((arr[Integer.parseInt(st.nextToken())])? 1:0)
                        .append('\n');
                        break;
                    case "toggle":
                        int target = Integer.parseInt(st.nextToken());
                        arr[target] = !arr[target];
                        break;
                    case "all":
                        Arrays.fill(arr, true);
                        break;
                    case "empty":
                        Arrays.fill(arr, false);
                        break;
                }
             }
            System.out.print(sb);
        }
    }
}
```

### 🎯 정답 코드 / 개선된 코드

```java
// 베스트 풀이 or 리팩토링 코드
// 비트마스크
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int m = Integer.parseInt(br.readLine());
            int bitset = 0; // 집합을 대신할 비트 마스크
            StringBuilder sb = new StringBuilder();

            while (m-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String op = st.nextToken();
                int num;

                switch (op) {
                    case "add":
                        num = Integer.parseInt(st.nextToken());
                        bitset |= (1 << (num - 1));
                        break;
                    case "remove":
                        num = Integer.parseInt(st.nextToken());
                        bitset &= ~(1 << (num - 1));
                        break;
                    case "check":
                        num = Integer.parseInt(st.nextToken());
                        sb.append((bitset & (1 << (num - 1))) != 0 ? "1\n" : "0\n");
                        break;
                    case "toggle":
                        num = Integer.parseInt(st.nextToken());
                        bitset ^= (1 << (num - 1));
                        break;
                    case "all":
                        bitset = (1 << 20) - 1; // 20개 비트를 모두 1로
                        break;
                    case "empty":
                        bitset = 0;
                        break;
                }
            }
            System.out.print(sb);
        }
    }
}
```
 
