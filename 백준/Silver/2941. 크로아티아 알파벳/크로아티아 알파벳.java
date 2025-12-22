import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String word = br.readLine();
            int len = word.length();             
            int answer = 0;
           
            for(int i=0; i<len; i++){
                char cur = word.charAt(i); 
                
                if(i<len-1){ // 다음 문자가 존재한다면,
                    char next = word.charAt(i+1);
                    
                    if(cur == 'd'){
                        if (next == '-') {
                            i++;
                        } else if (i < len - 2 && next == 'z' && word.charAt(i + 2) == '=') {
                            i += 2; // dz=
                        }
                    } else if(cur == 'c'){
                        if(next == '-' || next =='=') i++;
                    } else if((cur == 'l' || cur == 'n') && next =='j'){
                        i++;
                    } else if((cur == 's' || cur == 'z') && next =='='){
                        i++;
                    }
                }
                answer++; // 이동 후, 1글자 확인 완료
            }
            System.out.print(answer);
        }
    }
}