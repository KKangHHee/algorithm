import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        return IntStream.range(0, included.length) // for(int i = 0; i< included.length; i++)
                        .filter(i -> included[i]) // if(included[i])
                        .map(i -> a + (i * d)) 
                        .sum(); // sum += a+ (i * d)
    }
}