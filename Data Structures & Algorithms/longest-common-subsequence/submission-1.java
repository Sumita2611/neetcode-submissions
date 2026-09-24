class Solution {
    public int fun(int i , int j , String s1 , String s2 , int[][] dp){
        if(i >= s1.length() || j >= s2.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s1.charAt(i) == s2.charAt(j)){
            return 1 + fun(i+1 , j+1 , s1 , s2 , dp);
        }
        return dp[i][j] = Math.max(fun(i+1,j,s1,s2,dp) , fun(i,j+1,s1,s2,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length(),m = text2.length();
        int[][] dp = new int[n][m];
        for(int[] d : dp){
            Arrays.fill(d , -1);
        }
        return fun(0,0,text1,text2,dp);
    }
}
