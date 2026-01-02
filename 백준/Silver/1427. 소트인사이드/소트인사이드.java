// #정렬
// 입력1) n(1~1,000,000,000 -> 10^9) 

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            char[] arr = br.readLine().toCharArray();
            Arrays.sort(arr);
            
            StringBuilder sb = new StringBuilder();
            for (int i = arr.length - 1; i >= 0; i--) {
                sb.append(arr[i]);
            }

            System.out.print(sb);
            
        }
    }
}