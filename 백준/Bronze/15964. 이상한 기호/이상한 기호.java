import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        long result = (long) Math.pow(N, 2) - (long) Math.pow(M, 2);
        System.out.println(result);
    }
}