class Solution {
    public int solution(String s) {
        int answer = s.length();
        int n = s.length();
        int count = 1; 
        
        // 절반 이하의 단축이 불가능하기에 /2
        for (int i = 1; i <= n / 2; i++) {
            StringBuilder compressed = new StringBuilder(); // 비교 문자열을 담을 버퍼
            String base = s.substring(0, i); // 처음 비교하는 대상 
            
            // 문자열을 i 크기 단위로 잘라서 압축
            for (int j = i; j <= n; j += i) {
                int endIdx = Math.min(j + i, n); // 최대 길이를 벗어나지 못함
                String compare = s.substring(j, endIdx); // i번째 + j번째부터 비교 시작
                
                if(base.equals(compare)) {
                    count ++;
                } else {
                    if(count > 1) {
                        compressed.append(count);
                    }
                    compressed.append(base);
                    base = compare; // 압축된 곳까지 base에 
                    count = 1; // 초기화
                }
            }
            compressed.append(base);
            answer = Math.min(answer, compressed.length());
        }
        return answer;
    }
}