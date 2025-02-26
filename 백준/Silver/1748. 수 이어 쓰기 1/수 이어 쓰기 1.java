import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nLength = Integer.toString(n).length();
        long result = 0;
        
        for (int i = 1; i < nLength; i++) {
            result += 9 * (long) Math.pow(10, i - 1) * i;
        }
        result += (n - (int) Math.pow(10, nLength - 1) + 1) * nLength;
        System.out.println(result);
    }
}