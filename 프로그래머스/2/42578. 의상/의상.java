import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for(String[] c : clothes){
            String type = c[1];
            map.put(type, map.getOrDefault(type, 0)+1);
        }
        
        int answer = 1;
        
        for(int count : map.values()){ // 각 종류별 경우의 수를 곱함
            answer *= (count + 1);
        }
        
        return answer - 1; // 헐벗은 경우 제외
    }
}