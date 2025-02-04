import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner의 경우 하나의 객체만 사용해야 함
        System.out.println(sc.nextInt() <= sc.nextInt() ? "high speed rail" : "flight");
    }
}
