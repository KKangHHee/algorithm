class Solution {
    public int solution(int n) {
        int compositeCount = 0;

        for (int i = 1; i <= n; i++) {
            if (isComposite(i)) {
                compositeCount++;
            }
        }
        return compositeCount;
    }

    private boolean isComposite(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
            if (count >= 3) {
                return true;
            }
        }
        return false;
    }
}