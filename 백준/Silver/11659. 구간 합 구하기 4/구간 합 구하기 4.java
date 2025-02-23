// N일 때, i~j까지 수의 합
// 첫째 줄 :수의 개수 N, 합을 구하는 회수 M
// 둘째 줄 : N 개의 수, 각 수는 0 <= num <=1000
// 셋째~M 줄: 합을 구하는 구간 i~j 1 ≤ i ≤ j ≤ N

import java.io.BufferedReader; // 받는 양이 많으므로 Buffer로
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        // 첫번째 줄
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int suNo = Integer.parseInt(st.nextToken());    
        int quizNo = Integer.parseInt(st.nextToken());
        
        long[] S = new long[suNo+1];
        // 두번째 줄
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i<=suNo; i++){
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());  
        }
        
        // 세번째 줄
        for(int q = 1; q<=quizNo; q++){
            st = new StringTokenizer(br.readLine()); 
            int i = Integer.parseInt(st.nextToken());  
            int j = Integer.parseInt(st.nextToken());   
            System.out.println(S[j] - S[i-1]);
        }
    }
}



