class Solution {
    public int fun(int i , int j , String s , String t , int[][] dp){
        if(j == t.length()){
            return 1;
        }
        if(i == s.length()){
            return 0;
        }
        int ans = 0;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s.charAt(i) == t.charAt(j)){
            int take = fun(i+1 , j+1 , s , t , dp);
            int notTake = fun(i+1 , j , s ,t , dp);
            ans = take + notTake;
        }
        else{
            ans = fun(i+1 , j , s , t , dp);
        }
        return dp[i][j] = ans;
    }
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n][m];
        for(int[] d : dp){
            Arrays.fill(d , -1);
        }
        return fun(0 , 0 , s , t , dp);
    }
}
