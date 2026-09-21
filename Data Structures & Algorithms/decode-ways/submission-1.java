class Solution {
    public int fun(int ind , String s , int[] dp){
        if(ind == s.length()){
            return 1;
        }
        if(s.charAt(ind) == '0'){
            return 0;
        }
        if(dp[ind] != -1){
            return dp[ind];
        }
        int ways = fun(ind+1 , s , dp);
        //2 digits
        if(ind+1 < s.length()){
            int num = Integer.parseInt(s.substring(ind , ind+2));
            if(num >= 10 && num <= 26){
                ways += fun(ind+2 , s , dp);
            }
        }
        return dp[ind] = ways;
    }
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n];
        Arrays.fill(dp , -1);
        return fun(0 , s , dp);
    }
}
