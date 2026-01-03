// hashset의 contains메서드 활용
// 입력1) 숫자의 개수 n(1~500,000)
// 입력2) 숫자 (-10,000,000~10,000,000)
// 입력3) 비교군의 수 m (1~500,000)
// 입력4) 입력2와 동일


import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            Set<Integer> set = new HashSet<>();
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                set.add(Integer.parseInt(st.nextToken()));
            }
            
            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine()); // 재할당
            
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<m; i++){
                int num = Integer.parseInt(st.nextToken());
                if (set.contains(num)) sb.append("1 ");
                else sb.append("0 ");
            }
            
            System.out.print(sb);
        }
    }
}