// boolean 배열

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            boolean[] arr = new boolean[21]; // 1~20
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            
             while(n-- >0){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String op = st.nextToken();
                switch(op){
                    case "add":
                        arr[Integer.parseInt(st.nextToken())] = true;
                        break;
                    case "remove":
                        arr[Integer.parseInt(st.nextToken())] = false;
                        break;
                    case "check":
                        sb.append((arr[Integer.parseInt(st.nextToken())])? 1:0)
                        .append('\n');
                        break;
                    case "toggle":
                        int target = Integer.parseInt(st.nextToken());
                        arr[target] = !arr[target];
                        break;
                    case "all":
                        Arrays.fill(arr, true);
                        break;
                    case "empty":
                        Arrays.fill(arr, false);
                        break;
                }
             }
            System.out.print(sb);
        }
    }
}