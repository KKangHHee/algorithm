// 알고리즘)
// 규칙) .은 없는 것 x는 짐이 있는 것, 가로나 세로로 .이 연속일 경우 누을 수 있음
// 입력) 방의 크기 n(1~100), n줄에 n개의 문자
// 출력) 가로로 누울 수 있는 수, 세로로 ,,,

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            char[][] arr = new char[n][n];
            for(int i=0; i<n; i++){
                arr[i] = br.readLine().toCharArray();
            }
            
            int row = 0;
            int col = 0;
            
            for(int i=0; i<n; i++){
                int rowCount = 0;
                int colCount = 0;
                for(int j=0; j<n; j++){
                    if(arr[i][j] == '.'){
                        rowCount++;
                    } else { 
                        if(rowCount >=2) row++;
                        rowCount = 0;
                    }
                    
                    if(arr[j][i] == '.'){
                        colCount++;
                    } else{
                        if(colCount >=2) col++;
                        colCount = 0;
                    }
                }
                
                if(rowCount >=2) row++;
                if(colCount >=2) col++;
            }
            System.out.print(row + " " + col);
        }
    }
}