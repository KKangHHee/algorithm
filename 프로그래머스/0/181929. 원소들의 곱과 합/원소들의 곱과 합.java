class Solution {
    public int solution(int[] num_list) {
        int numListToMulitply = 1;
        int numListToSum = 0;
        
        for(int i : num_list){
            numListToMulitply *= i;
            numListToSum += i;
        }
        return numListToMulitply < numListToSum * numListToSum
            ? 1 : 0;
    }
}