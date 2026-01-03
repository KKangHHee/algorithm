// 정렬
// 입력1) 점의 개수 n (1~100,000)
// 입력2) x, y 배열
// 출력1) 배열 출력, 순서는 y기준 오름차순
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][2];
            
            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(arr, (a,b)->{
                if(a[1] != b[1]){
                    return Integer.compare(a[1], b[1]);
                }
                return Integer.compare(a[0], b[0]);
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