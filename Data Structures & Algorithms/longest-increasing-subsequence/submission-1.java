class Solution {
    public int fun(int ind , int prev , int[] nums , Integer[][] dp){
        if(ind == nums.length){
            return 0;
        }
        if(dp[ind][prev+1] != null){
            return dp[ind][prev+1];
        }
        int notTake = 0 + fun(ind+1 , prev , nums , dp);
        int take = 0;
        if(prev == -1 || nums[ind] > nums[prev]){
            take = 1 + fun(ind + 1 , ind , nums , dp);
        }
        return dp[ind][prev+1] = Math.max(take , notTake);
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        Integer[][] dp = new Integer[n][n+1];
        return fun(0 , -1 , nums , dp);
    }
}
