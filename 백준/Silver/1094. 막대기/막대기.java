// 알고리즘) 64, 32, 16, 8, 4, 2, 1
// 규칙)
// 입력)
// 츨력)


import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int x = Integer.parseInt(br.readLine());
            int count = 0;
            while(x>0){
                if((x&1)==1) count++;
                x >>=1;
            }
            System.out.print(count);
        }
    }
}