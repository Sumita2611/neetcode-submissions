class Solution {
    public int fun(int i , int j , String s , int[][] dp){
        if(i >= j){
            return 1;
        }
        if(s.charAt(i) != s.charAt(j)){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        return dp[i][j] = fun(i+1 , j-1 , s , dp);
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int[] d : dp){
            Arrays.fill(d , -1);
        }
        int start = 0,maxLen = 1;
        for(int i = 0;i < n;i++){
            for(int j = i;j < n;j++){
                if(fun(i , j , s , dp) == 1){
                int len = j-i+1;
                if(len > maxLen){
                    maxLen = len;
                    start = i;
                }
            }
            }
        }
        return s.substring(start , start + maxLen);
    }
}
