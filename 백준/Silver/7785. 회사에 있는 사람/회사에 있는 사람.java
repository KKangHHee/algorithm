// 알고리즘) set(중복 허용 x)
// 규칙)
// 입력) 출입 기록의 수 n(2~10^6), 이름 enter/leave
// 출력) 남은 인원을 사전의 역순으로, 한명씩,

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            Set<String> set = new HashSet<>();
            
            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String cmd = st.nextToken();
                
                if(cmd.equals("enter")) set.add(name);
                else set.remove(name);
            }
            
            List<String> list = new ArrayList<>(set);
            list.sort(Collections.reverseOrder());
            
            StringBuilder sb = new StringBuilder();
            for(String s : list){
                sb.append(s)
                    .append('\n');
            }
            System.out.print(sb);
            
        }
    }
}