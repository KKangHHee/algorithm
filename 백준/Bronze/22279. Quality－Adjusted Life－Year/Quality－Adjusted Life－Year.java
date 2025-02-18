import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 0;
        while (n-- > 0) {
            sum += sc.nextFloat() * sc.nextFloat();
        }
        System.out.printf("%.3f\n", sum);
    }
}