class Solution {
    private int maxCount = 0; // 최대 횟수
    private boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return maxCount;
    }
    
    private void dfs(int fatigue, int[][] dungeons, int count){
        maxCount = Math.max(maxCount, count);
        
        for(int i=0; i<dungeons.length; i++){
            int need = dungeons[i][0];
            int consume = dungeons[i][1];
            
            if(!visited[i] && fatigue >= need){
                visited[i] = true;
                dfs(fatigue - consume, dungeons, count +1);
                visited[i] = false;
            }
        }
    }
}