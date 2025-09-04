import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> days = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i<progresses.length; i++){ // n번
            int remain = 100 - progresses[i]; // 남은 %
            int day = (remain + speeds[i] - 1) / speeds[i]; // 올림 공식: ceil(a/b) = a+b-1 / b
            days.add(day);
        }
        
        while(!days.isEmpty()){ // n번 -> O(n^2)
            int first = days.poll();
            int count = 1;
            
            while(!days.isEmpty() && days.peek() <= first){ // n번
                count++;
                days.poll();
            }
            result.add(count);
        }
        
        return result.stream()
                        .mapToInt(i->i)
                        .toArray();
    }
}