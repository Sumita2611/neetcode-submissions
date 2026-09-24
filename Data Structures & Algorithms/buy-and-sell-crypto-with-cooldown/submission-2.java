class Solution {
    public int fun(int i , int buy , int[] prices , int[][] dp){
        if(i >= prices.length){
            return 0;
        }
        if(dp[i][buy] != -1){
            return dp[i][buy];
        }
        if(buy == 1){
            int take = -prices[i] + fun(i+1 , 0 ,prices , dp);
            int notTake = fun(i+1 , 1 , prices , dp);
            return dp[i][buy] = Math.max(take , notTake);
        }
        else{
            int sell = prices[i] + fun(i+2 , 1 , prices , dp);
            int hold = fun(i+1 , 0 , prices , dp);
            return dp[i][buy] = Math.max(sell , hold);
        }
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+1][2];
        for(int[] d : dp){
            Arrays.fill(d , -1);
        }
        return fun(0 , 1 , prices , dp);
    }
}
