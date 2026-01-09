import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int x = Integer.parseInt(br.readLine());
						int count = Integer.bitCount(x);
            System.out.print(count);
        }
    }
}
