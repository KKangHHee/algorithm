// 알고리즘) int[]
// 규칙) 1세트에 0~9, 6과 9는 혼용가능
// 입력)n, 0~1,000,000
// 출력)

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String n = br.readLine();
            int[] count = new int[10]; // 0~9
            
            for(char c : n.toCharArray()){
                count[c - '0']++;
            }
            
            int sixNine = count[6] + count[9];
            int need = (sixNine+1) /2;
            count[6] = need;
            count[9] = need;
            
            int answer = 0;
            for(int c : count){
                if(c > answer) answer = c;
            }
            System.out.print(answer);

        }
    }
}