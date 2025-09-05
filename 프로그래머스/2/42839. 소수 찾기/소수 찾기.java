import java.util.*;

class Solution {
    HashSet<Integer> set = new HashSet<>();
    boolean[] visited;
    
    public int solution(String numbers) {
        visited = new boolean[numbers.length()];
        backtrack("", numbers);
        
        int count = 0;
        for(int num : set){
            if(isPrime(num)) count++;
        }
        return count;
    }
    
    private void backtrack(String current, String numbers){
        if(!current.equals("")){
            set.add(Integer.parseInt(current));
        }
        
        for(int i=0; i<numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                backtrack(current + numbers.charAt(i), numbers);
                visited[i] = false;
            }
        }
    }

    private boolean isPrime(int n) {
        if(n < 2) return false; // 0, 1은 소수 x
        if(n == 2) return true; // 2는 짝수인 소수
        if(n % 2 == 0) return false; // 2 이외의 짝수는 소수 X
        
        for (int i = 3; i * i <= n; i+=2) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
}