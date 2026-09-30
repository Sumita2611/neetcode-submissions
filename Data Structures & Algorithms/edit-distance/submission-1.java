class Solution {
    public int fun(int i , int j , String word1 , String word2,int[][] dp){
        if(i == word1.length()){
            return word2.length() - j;
        }
        if(j == word2.length()){
            return word1.length() - i;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(word1.charAt(i) == word2.charAt(j)){
            return fun(i+1 , j+1 , word1, word2 , dp);
        }
        int delete = fun(i+1 , j , word1 , word2 , dp);
        int insert = fun(i , j+1 , word1 , word2 , dp);
        int replace = fun(i+1 , j+1 , word1 , word2 , dp);
        return dp[i][j] = 1 + Math.min(delete , Math.min(insert , replace));
    }
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        for(int[] d : dp){
            Arrays.fill(d , -1);
        }
        return fun(0 , 0 , word1 , word2 , dp);
    }
}
