import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] arge){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        // stream 으로 변환하여 내장 메서드 이용
        System.out.print(Arrays.stream(arr).sum() * 100.0 / Arrays.stream(arr).max().getAsInt() / n);
    }
}