import java.util.Scanner;

public class Main {
    public static int calculate(int n, int count) {
        return n == 1 ? count: calculate(n%2==0 ? n/2 : 3*n+1, count+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(calculate(n,1));
    }
}