class Solution {
    public int fun(int ind , int amount , int[] coins){
        if(ind == 0){
            if(amount % coins[0] == 0){
                return amount/coins[0];
            }
            else{
                return (int) Math.pow(10,9);
            }
        }
        int notTake = 0 + fun(ind-1 , amount , coins);
        int take = Integer.MAX_VALUE;
        if(coins[ind] <= amount){
            take = 1 + fun(ind , amount-coins[ind] , coins);
        }
        return Math.min(take , notTake);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int ans = fun(n-1 , amount , coins);
        if(ans >= (int) Math.pow(10,9)){
            return -1;
        }
        return ans;
    }
}
