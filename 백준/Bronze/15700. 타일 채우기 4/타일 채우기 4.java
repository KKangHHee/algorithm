import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner는 공백 or 엔터를 구분자로 사용
        System.out.print((sc.nextLong() * sc.nextLong()) / 2);
    }
}
