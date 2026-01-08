//
// 입력1) 20줄 과목명 학점 등급
// 출력1) 전공 평점

import java.io.*;
import java.util.*;

public class Main{
    private static double convert(String grade){
        switch(grade){
            case "A+": return 4.5;
            case "A0": return 4.0;            
            case "B+": return 3.5;
            case "B0": return 3.0;            
            case "C+": return 2.5;
            case "C0": return 2.0;            
            case "D+": return 1.5;
            case "D0": return 1.0;
            default: return 0.0; // f
        }
    }
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            double totalCredit = 0.0; // 학점
            double totalScore = 0.0; 
            
            for(int i=0; i<20; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                double credit = Double.parseDouble(st.nextToken());
                String grade = st.nextToken();
                
                if(grade.equals("P"))
                    continue;
                
                totalCredit +=credit;
                totalScore += credit * convert(grade);
            }
            System.out.printf("%.6f", totalScore / totalCredit);
        }
    }
}