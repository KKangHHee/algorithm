// 입력1) n(~10,000)
// 규칙) 제목: "세상의 종말 x", 이때 x는 666이 들어가는 n번째로 작은 수
// 출력1) x를 출력

import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            
            int count = 0; // 완탐 기준
            int x = 666; // 시작값
            
            while(true){
                if(String.valueOf(x).contains("666")){
                    count++;
                    if(count == n){
                        System.out.print(x);
                        break;
                    }
                }
                x++;
            }
        }
    }
}
