/*
- lines : [[start, end], [start, end], [start, end]]
- lines[i].length = 2
- lines[i]: end - start >= 1
- -100 ≤ start < end ≤ 100
*/
class Solution {
    public int solution(int[][] lines) {
        // 좌표 범위 -100 ≤ start < end ≤ 100
        int[] counts = new int[200];
        
        for (int[] line : lines){
            int start = line[0];
            int end = line[1];
            
            for (int i = start; i < end; i ++){
                counts[i+100]++; // counts[0]이 -100이므로
            
            }
        }
        
        int overlapCount = 0;
        for (int count : counts) {
            if (count > 1) {
                overlapCount++;
            }
        }
        return overlapCount;
    }
}

/* tip : 스위핑 알고리즘
+ 선분의 수가 더 많아지거나
+ 선분의 길이가 더 커질 경우 사용
+ O(n log n)
    1) Event 클래스를 레코드로 단순화
    record Event(int pos, int type) {}

    2) 함수 작성
    public int solution(int[][] lines) {
        List<Event> events = new ArrayList<>();
        
        // 1. 각 선분의 시작과 끝을 이벤트로 저장
        for (int[] line : lines) {
            events.add(new Event(line[0], 1));  // 시작: +1
            events.add(new Event(line[1], -1));  // 끝: -1
        }
        
        // 2. 위치 기준으로 정렬 (같은 위치일 때는 시작 이벤트를 먼저)
        Collections.sort(events, (a, b) -> {
            if (a.pos() == b.pos()) 
                return b.type() - a.type();
            return a.pos() - b.pos();
        });

        int overlap = 0;
        int count = 0;
        int prev = 0;

        // 3. 스위핑 시작
        for (Event e : events) {
            if (count >= 2) {
                overlap += e.pos() - prev;
            }
            count += e.type();
            prev = e.pos();
        }

        return overlap;
    }
*/
