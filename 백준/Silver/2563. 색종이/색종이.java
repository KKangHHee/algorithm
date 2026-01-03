// 구현
// 입력1) 색종이의 수 n(1~100)
// 입력2) 색종이의 위치 x y(0~100)
// 추가 정보) 색종이의 크기 10*10

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            boolean[][] arr = new boolean[100][100];
            int answer = 0;
            
            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                
                // 10*10
                for(int xl = x; xl<x+10; xl++){
                    for(int yl = y; yl<y+10; yl++){
                        if(!arr[xl][yl]){
                            arr[xl][yl] = true;
                            answer++;
                        }
                    }
                }
            }            
            System.out.print(answer);
        }
    }
}