class Solution {
    int[][] dir = {{-1,0} , {1,0} , {0,-1} , {0,1}};
    public int fun(int i , int j , int[][] matrix , int[][] dp){
        int best = 1;
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        for(int[] d : dir){
            int newI = i + d[0];
            int newJ = j + d[1];
            if(newI >= 0 && newI < matrix.length && newJ >= 0 && newJ < matrix[0].length){
                if(matrix[newI][newJ] > matrix[i][j]){
                    int path = 1 + fun(newI , newJ , matrix , dp);
                    best = Math.max(best , path);
                }
            }
        }
        return dp[i][j] = best;
    }
    public int longestIncreasingPath(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        int ans = 0;
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j < matrix[0].length;j++){
                ans = Math.max(ans , fun(i , j , matrix , dp));
            }
        }
        return ans;
    }
}
