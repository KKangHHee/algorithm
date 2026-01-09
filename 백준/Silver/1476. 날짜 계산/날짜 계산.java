/*
- 알고리즘) 시뮬레이션
- 규칙)
- 입력) E S M (E: 1~15, S: 1~28, M:1~19)
- 출력) 
*/


import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int E = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int year=1;
            
            while(true){
                if ((year - E) % 15 == 0 
                    && (year - S) % 28 == 0 
                    && (year - M) % 19 == 0)
                    break;
                
                year++;
            }
            
            System.out.print(year);
        }
    }
}