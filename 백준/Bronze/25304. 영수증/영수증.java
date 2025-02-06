import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int X = sc.nextInt();
        int n = sc.nextInt();
    
        int total = 0;
        for(int i = 0; i<n; i++){
            int items = sc.nextInt();
            int num = sc.nextInt();
            total += items * num;
        }
    
        if(X == total){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}