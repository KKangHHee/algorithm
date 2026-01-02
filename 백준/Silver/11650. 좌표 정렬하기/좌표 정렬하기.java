// 입력1) 점의 개수 n(1~100,000)
// 입력2) i번 점의 위치 x,y (-100,000~100,000), 같은 위치의 점 x

// 풀이) 2차원 배열로 저장한 뒤 comparator정렬
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine()); // 입력1)
            int[][] arr = new int[n][2]; // n개의 입력에 대한 {x, y}
            
            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[i][0] = Integer.parseInt(st.nextToken()); // x
                arr[i][1] = Integer.parseInt(st.nextToken()); // y
            }
            
            Arrays.sort(arr, (a,b)->{
                if(a[0] != b[0]){
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
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