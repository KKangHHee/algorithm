// 입력1) 회원의 수 n (1~100,000)
// 입력2) 나이, 이름(알파벳 대소문자, 100자 이하)
// 출력1) 나이 오름차순, 같으면 가입한 순.

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            String[][] arr = new String[n][2];
            
            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[i][0] = st.nextToken(); // age: string type
                arr[i][1] = st.nextToken(); // name
            }
            
            Arrays.sort(arr, (a,b)->{
                int ageA = Integer.parseInt(a[0]);
                int ageB = Integer.parseInt(b[0]);
                return Integer.compare(ageA, ageB);
            });
            
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<n; i++){
                sb.append(arr[i][0])
                    .append(' ')
                    .append(arr[i][1])
                    .append('\n');
            }
            System.out.print(sb);
        }
    }
}