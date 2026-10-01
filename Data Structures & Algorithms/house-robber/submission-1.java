class Solution {
    public int fun(int ind , int[] nums , int[] dp){
        if(ind == 0){
            return nums[0];
        }
        if(ind < 0){
            return 0;
        }
        if(dp[ind] != -1){
            return dp[ind];
        }
        int take = nums[ind] + fun(ind-2 , nums , dp);
        int notTake = fun(ind-1 , nums , dp);
        return dp[ind] =  Math.max(take , notTake);
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp , -1);
        return fun(nums.length-1 , nums , dp);
    }
}
