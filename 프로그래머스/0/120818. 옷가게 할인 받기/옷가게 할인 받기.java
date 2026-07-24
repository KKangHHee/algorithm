class Solution {
    public int solution(int price) {
    // 10만원 0.05
    // 30만원 0.1
    // 50만원 0.2
        if (price >= 500000) {
            return (int) (price * 0.80);
        } else if (price >= 300000) {
            return (int) (price * 0.90);
        } else if (price >= 100000) {
            return (int) (price * 0.95);
        }
        
        // 10만원 미만은 할인 없음
        return price;
    }
}