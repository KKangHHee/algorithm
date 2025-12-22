import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        // 1) 입력 값 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); // n
        
        int count = 0; // 그룹 단어의 개수
        for(int i=0; i<num; i++){
            if(checkFn(br.readLine())){
                count++;
            }
        }
        
        // 메모리 누수 방지
        br.close();
        System.out.println(count);
    }
    
    private static boolean checkFn(String str){
        boolean[] alpha = new boolean[26]; // 26자의 알파벳
        int pre = -1; // 연속으로 나오는 것 확인용
        
        for(int i=0; i<str.length(); i++){
            int now = str.charAt(i) - 'a';
            
            if(pre != now){
                if (alpha[now]) {
                    return false;
                }
                alpha[now] = true;
                pre = now;
            }
        }    
        return true; 
    }
}