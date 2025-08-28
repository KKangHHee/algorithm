class Solution {
    public int solution(int n) {
        if (n % 2 != 0) {
            // n이 홀수일 때: (n+1)/2 의 제곱
            return (n + 1) / 2 * ((n + 1) / 2);
        } else {
            // n이 짝수일 때: n 이하 짝수 제곱의 합 공식
            return n * (n + 1) * (n + 2) / 6;
        }
    }
}