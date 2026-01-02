// 입력1) n(1~10,000,000)
// 규칙1) 대각선
/* 
    1: 1/1 개별 합:1    
    2: 1/2, 2/1 개별 합 3*2 /2
    3: 3/1, 2/2, 1/3 개별 합 4*3 /2
    -> n번째 라인에는 n개의 분수
    -> 해당 대각선의 합 = n(n+1) / 2
*/
// 규칙2) 지그재그
/* 
    n이 홀수일 때, 아래서 위로: a/b일때 a감소 b증가   
    n이 짝수일 때, 아래서 위로: a/b일때 a증가 b감소
    ---
    라인이 홀수일 때, 분자(=라인-x+1)/분모(x)
    라인이 짝수일 때, 분자(=x)/분모(라인-x+1)
*/
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            int line = 1; // 현재 라인 번호, (1,1)의 라인부터
            int sum = 0; // 이전 라인까지의 누적 개수
            
            while(true){
                if(n <= sum+line){
                    int position = n-sum;
                    
                    if(line %2 ==0){
                        System.out.print(position + "/" + (line-position+1));
                    } else{
                        System.out.print((line-position+1) + "/" + position);
                    }
                    break;
                }
                
                sum += line;
                line++;
            }
        }
        
    }
}