class Solution {
    public int fun(int i , int j , String s1 , String s2 , String s3 ,  int[][] dp){
        int n = s1.length() , m = s2.length();
        if(i == n && j == m){
            return 1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(i < n && i+j < s3.length() && s1.charAt(i) == s3.charAt(i+j) && fun(i+1 , j , s1 , s2 , s3, dp) == 1){
            return dp[i][j] = 1;
        }
        if(j < m && i+j < s3.length() && s2.charAt(j) == s3.charAt(i+j) && fun(i , j+1 ,s1 , s2 , s3 , dp) == 1){
            return dp[i][j] = 1;
        }
        return dp[i][j] = 0;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length() , m = s2.length();
        if(n+m != s3.length()){
            return false;
        }
        int[][] dp = new int[n+1][m+1];
        for(int[] d : dp){
            Arrays.fill(d , -1);
        }
        return fun(0 , 0 , s1 , s2 , s3 , dp) == 1;
    }
}
