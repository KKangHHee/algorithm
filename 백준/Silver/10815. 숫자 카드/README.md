# [Silver V] 숫자 카드 - 10815 

[문제 링크](https://www.acmicpc.net/problem/10815) 

### 성능 요약

메모리: 137124 KB, 시간: 844 ms

### 분류

자료 구조, 정렬, 이분 탐색, 집합과 맵, 해시를 사용한 집합과 맵

### 제출 일자

2026년 1월 3일 22:00:07

### 문제 설명

<p>숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다. 두 숫자 카드에 같은 수가 적혀있는 경우는 없다.</p>

<p>셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 넷째 줄에는 상근이가 가지고 있는 숫자 카드인지 아닌지를 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다</p>

### 출력 

 <p>첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 가지고 있으면 1을, 아니면 0을 공백으로 구분해 출력한다.</p>

--- 
### 🎯 정답 코드 / 개선된 코드

- **왜 `>= 0` 인가?**:
    - `Arrays.binarySearch()`는 값을 찾으면,
    - 해당 인덱스(0~ n-1)를 반환
    - 만약 값을 찾지 못하면 **음수**를 반환하는데,
    - 이 음수는 `-(최초로 큰 값이 나오는 인덱스) - 1`
    - 단순히 존재 여부만 체크할 때는 "0보다 크거나 같은가"만 확인
- 이진 탐색은 값이 "있는지 없는지"만 구할 때, 굿
- "같은 숫자가 몇 개 있는지" 구해야 할 때는
    - `lowerBound`와 `upperBound`

```java
// 베스트 풀이 or 리팩토링 코드
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            
            // 이진 탐색의 전제 조건: 반드시 데이터가 정렬되어 있어야 함
            Arrays.sort(arr);

            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m; i++) {
                int target = Integer.parseInt(st.nextToken());
                
                // 반환값이 0 이상이면 배열 내에 타겟이 존재함
                if (Arrays.binarySearch(arr, target) >= 0) {
                    sb.append("1 ");
                } else {
                    sb.append("0 ");
                }
            }

            System.out.print(sb);
        }
    }
}

```
