import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers)
            .average()
            .orElse(0.0);
//         double sum = 0;
//         for (int number : numbers){
//             sum += number;
//         }
        
//         return sum / number.length;
    }
}