# [Silver V] 크로아티아 알파벳 - 2941 

[문제 링크](https://www.acmicpc.net/problem/2941) 

### 성능 요약

메모리: 14236 KB, 시간: 104 ms

### 분류

구현, 문자열

### 제출 일자

2025년 12월 22일 20:51:31

### 문제 설명

<p>예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.</p>

<table class="table table-bordered table-center-20 th-center td-center">
	<thead>
		<tr>
			<th>크로아티아 알파벳</th>
			<th>변경</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>č</td>
			<td>c=</td>
		</tr>
		<tr>
			<td>ć</td>
			<td>c-</td>
		</tr>
		<tr>
			<td>dž</td>
			<td>dz=</td>
		</tr>
		<tr>
			<td>đ</td>
			<td>d-</td>
		</tr>
		<tr>
			<td>lj</td>
			<td>lj</td>
		</tr>
		<tr>
			<td>nj</td>
			<td>nj</td>
		</tr>
		<tr>
			<td>š</td>
			<td>s=</td>
		</tr>
		<tr>
			<td>ž</td>
			<td>z=</td>
		</tr>
	</tbody>
</table>

<p>예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.</p>

<p>dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.</p>

### 입력 

 <p>첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.</p>

<p>단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.</p>

### 출력 

 <p>입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.</p>

 ## 🧠 접근 방법 (How I Thought)

- 처음 접근: String의 replace를 통해 조건에 포함되는 문자를 “*”로 치환 → 전체 String의 길이 확인
- 실패/막힌 지점:
- 정답 방향 전환 포인트:

---

## 📍 풀이 코드 (Mine)

```java
// 나의 풀이 코드 here
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
            String word = br.readLine();
            
            for(String c : croatia){
                word = word.replace(c, "*"); // 크로아티아 알파벳을 *로 치환
            }
            
            System.out.println(word.length());
        }
    }
}
```

### 🎯 정답 코드 / 개선된 코드

> 인덱스 이동 방식(for문 + 조건)
> 
- 문자열을 앞에서부터 직접 탐색
- 현재 위치에서 인덱스로 확인
- Switch를 사용하여 명료하게 분기

```java
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String s = br.readLine();
            char[] str = s.toCharArray();
            int len = str.length;             
            int answer = 0;
           
            for(int i=0; i<len; i++){
                char cur = str[i];                
                if(i<len-1){ // 다음 문자가 존재한다면,
                    char next = str[i + 1];
                    
                    switch(cur){
                        case 'c':
                            if(next == '=' || next =='-') i++;
                            break;
                        case 'd':
                            if(next == '-') i++;
                            else if(next == 'z' && i<len-2 && str[i+2]=='=') i+=2;
                            break;
                        case 'l':
                        case 'n':
                            if(next == 'j') i++;
                            break;
                        case 's':
                        case 'z':
                            if(next == '=') i++;
                            break;
                    } // end - switch
                } // end - if
                answer++; // 이동 후, 1글자 확인 완료
            } // end - for
            System.out.print(answer);
        }
    }
}
```

