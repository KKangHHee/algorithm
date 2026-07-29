class Solution {
    private final int[][] memo = new int[31][31];
    
    public int solution(int balls, int share) {
        return combination(balls, share);
    }
    
    private int combination(int n, int r){
        if (r == 0 || n == r) {
            return 1;
        }
        
        if(memo[n][r] > 0){
            return memo[n][r];
        }
        
        return memo[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }
}