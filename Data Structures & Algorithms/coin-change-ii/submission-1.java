class Solution {
    public int fun(int ind , int amount , int[] coins , int[][] dp){
        if(ind == 0){
            if(amount % coins[0] == 0){
                return 1;
            }
            return 0;
        }
        if(dp[ind][amount] != -1){
            return dp[ind][amount];
        }
        int notTake = fun(ind-1 , amount , coins , dp);
        int take = 0;
        if(coins[ind] <= amount){
            take = fun(ind , amount-coins[ind] , coins , dp);
        }
        return dp[ind][amount] = notTake + take;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int[] d : dp){
            Arrays.fill(d , -1);
        }
        return fun(n-1 , amount , coins , dp);
    }
}
