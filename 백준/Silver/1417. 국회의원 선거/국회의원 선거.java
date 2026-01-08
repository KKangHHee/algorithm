// 알고리즘)
// 규칙) 다솜은 1번, 매수할 사람의 최솟값
// 입력) 후보의 수 n(1~50), 주민의 수 m(~n*100)
// 출력)

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            
            if(n == 1){
                System.out.print(count);
                return;
            }
            
            int dasom = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int i=0; i<n-1; i++){ // 다솜이 없으므로.
                pq.add(Integer.parseInt(br.readLine()));
            }
            
            while(!pq.isEmpty() && pq.peek()>=dasom){
                int max = pq.poll();
                max--;
                dasom++;
                count++;
                pq.add(max);
            }
            
            System.out.print(count);
        }
    }
}