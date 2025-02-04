import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        String order = sc.next().toUpperCase();
        
        int[] nums = {num1, num2, num3};
        Arrays.sort(nums);
        
        Map<Character, Integer> orderMap = new HashMap<>();
        orderMap.put('A', nums[0]);
        orderMap.put('B', nums[1]);
        orderMap.put('C', nums[2]);
        
        System.out.println(orderMap.get(order.charAt(0)) + " " + 
                           orderMap.get(order.charAt(1)) + " " + 
                           orderMap.get(order.charAt(2)));
        
        sc.close(); // 닫아주기 잊지말기..
        
    }
}