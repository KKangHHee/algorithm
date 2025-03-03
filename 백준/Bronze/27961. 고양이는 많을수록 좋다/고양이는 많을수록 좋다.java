import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        
        // N이 0일 경우 0 출력
        if (N == 0) {
            System.out.println(0);
        } else {
            int k = 0;
            long value = 1;
            while (value < N) {
                value *= 2;
                k++;
            }
            System.out.println(k+1);
        }
    }
}

