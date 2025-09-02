class Solution {
    public int solution(String number) {
        int num_sum = 0;
        
        for (char numChar : number.toCharArray()) {
            num_sum += (numChar - '0');
        }
        
        return num_sum % 9;
    }
}