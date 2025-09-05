import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int idx =0; idx<commands.length; idx++){
            int i = commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];
            
            int[] temp = Arrays.copyOfRange(array, i-1, j);
            qsort(temp, 0, temp.length-1);
            answer[idx] = temp[k-1];
        }
        
        return answer;
    }
    
    private void qsort(int[] arr, int start, int end){
        // base case;
        if(start >= end) return;
        
        // 필요값 정의
        int left = start;
        int right = end;
        int pivot = arr[(start+end)/2];
        
        // 분할정복 시작
        while(left <= right){
            
            // 양쪽으로 포인터 이동
            while(arr[left] < pivot) left++;
            while(arr[right] > pivot) right--;
            
            if(left <= right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                
                left++;
                right--;
            }
        }
        // 파티션별 분할 정복
        if(start < right) qsort(arr, start, right);
        if(left < end) qsort(arr, left, end);
    }
}