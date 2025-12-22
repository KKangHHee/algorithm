# [Silver V] 수 정렬하기 2 - 2751 

[문제 링크](https://www.acmicpc.net/problem/2751) 

### 성능 요약

메모리: 121012 KB, 시간: 1356 ms

### 분류

정렬

### 제출 일자

2025년 12월 22일 17:08:38

### 문제 설명

<p>N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.</p>

### 출력 

 <p>첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.</p>

## 🧠 접근 방법 (How I Thought)

- 처음 접근: `Buffer`를 통해 I/O 성능 향상을 꾀함
- 실패/막힌 지점:
- 정답 방향 전환 포인트:

---

## 📍 풀이 코드 (Mine)

```java
// 나의 풀이 코드 here
import java.io.IOException;
import java.util.Arrays;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine()); // 조건 1) 1~1,000,000
            
            int[] data = new int[n];
            for(int i=0; i<n; i++){
                data[i] = Integer.parseInt(br.readLine());
            }
            
            Arrays.sort(data);
            
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for(int i=0; i<n; i++){
                bw.write(Integer.toString(data[i]));
                bw.newLine();
            }
            bw.flush();
        }
    }
    
}
```

### 🎯 정답 코드 / 개선된 코드

- `Arrays.sort()`의 경우: Dual-Pivot Quick Sort 알고리즘 사용
    - 평균: O(N log N)
    - 최악의 경우: O(N^2) → 특정 패턴의 반복이나 이미 정렬된 경
- `Collections.sort` 의 경우, 박싱 오버헤드의 발생 가능
- 출력 시, **`StringBuilder`VS `BufferedWriter`**

| **구분** | **StringBuilder** | **BufferedWriter** |
| --- | --- | --- |
| **장점** | 구현이 매우 간결함, 메모리 내 연산이라 매우 빠름 | 메모리 점유율이 낮음 (대용량 데이터에 유리) |
| **단점** | 데이터가 너무 많으면 `OutOfMemoryError` 발생 가능 | `IOException` 예외 처리가 필수적임 |
| **추천 상황** | **대부분의 알고리즘 문제 (N ≤ 1,000,000)** | 메모리 제한이 극도로 타이트하거나 출력량이 기가바이트급일 때 |

```java
// 베스트 풀이 or 리팩토링 코드
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine()); // 조건 1) 1~1,000,000
            
            int[] data = new int[n];
            for(int i=0; i<n; i++){
                data[i] = Integer.parseInt(br.readLine());
            }
            
            Arrays.sort(data);
            
						for (int val : data) {
	            sb.append(val).append('\n');
		        }
		        System.out.print(sb);
        }
    }
}

```
