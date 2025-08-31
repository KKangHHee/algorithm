import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        Queue<Long> queue = new LinkedList<>();
        queue.add(5L); // 5로 시작
        
        while (!queue.isEmpty()) {
            long num = queue.poll();
            if (num > r) continue; // num < r이고
            if (num >= l) result.add((int)num); // l <= num이면 추가
            queue.add(num * 10);       // 뒤에 0 추가
            queue.add(num * 10 + 5);   // 뒤에 5 추가
        }
        
        if (result.isEmpty()) return new int[]{-1};
        return result.stream().mapToInt(i -> i).toArray();
    }
}
