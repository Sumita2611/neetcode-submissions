class Solution {
    public int fun(int ind , int amount , int[] coins , int[][] dp){
        if(ind == 0){
            if(amount % coins[ind] == 0){
                return amount/coins[ind];
            }
            else{
                return (int) Math.pow(10 , 9);
            }
        }
        if(dp[ind][amount] != -1){
            return dp[ind][amount];
        }
        int notTake = fun(ind-1 , amount , coins, dp);
        int take = (int) Math.pow(10 , 9);
        if(coins[ind] <= amount){
            take = 1 + fun(ind , amount-coins[ind] , coins , dp);
        }
        return Math.min(take , notTake);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int[] d : dp){
            Arrays.fill(d , -1);
        }
        int ans = fun(n-1 , amount , coins , dp);
        if(ans == (int) Math.pow(10 , 9)){
            return -1;
        }
        return ans;
    }
}
