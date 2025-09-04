import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int length = prices.length;
        int[] answer = new int[length];
        
        for(int i = 0; i<length; i++){
            while(!st.isEmpty() && prices[i] < prices[st.peek()]){
                int idx = st.pop();
                answer[idx] = i - idx;
            }
            st.push(i);
        }
        
        while(!st.isEmpty()){
            int idx = st.pop();
            answer[idx] = (length - 1) - idx;
        }
        return answer;
    }
}