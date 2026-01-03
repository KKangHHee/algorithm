// 
// 입력 1) n(0~500)
// 출력 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지의 0의 개수
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            
            // n의 값이 500까지 매우크므로 수적 접근 시 메모리 터짐
            // 수학적으로 접근 10 = 2*5
            // 근데 1, 2, 3, 4, 5, 6 ,,, 처럼 5의 배수 사이에는 2가 충분하므로 5의 배수만 카운팅
            
            int count = 0;
            while(n>=5){
                count += (n/5);
                n /= 5;
            }
            
            System.out.print(count);
        }
    }
}