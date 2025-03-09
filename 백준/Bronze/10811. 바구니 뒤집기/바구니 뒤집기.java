import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void reverse(List<Integer> baskets, int start, int end) {
        while (start < end) {
            int temp = baskets.get(start); // baskets[start]
            baskets.set(start, baskets.get(end)); // baskets[start] =  baskets[end]
            baskets.set(end, temp); // baskets[end] =  baskets[start]
            
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        List<Integer> baskets = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            baskets.add(i);
        }
        
        for (int k = 0; k < M; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            reverse(baskets, i - 1, j - 1);
        }

        for (int num : baskets) {
            System.out.print(num + " ");
        }
    }
}