import java.util.HashSet;
import java.util.Set; 

class Solution { 
    public int solution(int a, int b, int c) { 
        Set<Integer> dice = new HashSet<>(); // 생성 시 바로 넣으면 입력값오류(중복 허용 X기에)
        dice.add(a);
        dice.add(b);
        dice.add(c);
        
        int size = dice.size();
        
        if (size == 1) { // a == b == c 
            return (a + b + c) 
                * (a * a + b * b + c * c) 
                * (a * a * a + b * b * b + c * c * c); 
        } else if (size == 2) { // 두개가 같음 
            return (a + b + c) 
                * (a * a + b * b + c * c); 
        } else { // 모두 다름 
            return a + b + c; 
        } 
    }
}