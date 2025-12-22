import java.io.IOException;
import java.util.Arrays;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine()); // 조건 1) 1~1,000,000
            
            int[] data = new int[n];
            for(int i=0; i<n; i++){
                data[i] = Integer.parseInt(br.readLine());
            }
            
            Arrays.sort(data);
            
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for(int i=0; i<n; i++){
                bw.write(Integer.toString(data[i]));
                bw.newLine();
            }
            bw.flush();
        }
    }
    
}