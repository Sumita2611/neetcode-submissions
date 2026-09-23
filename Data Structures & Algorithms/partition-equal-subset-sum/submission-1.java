class Solution {
    public boolean fun(int ind , int target , int[] nums , Boolean[][] dp){
        if(ind == 0){
        if(nums[0] == target){
            return true;
        }
        return false;
        }
        if(dp[ind][target] != null){
            return dp[ind][target];
        }
        boolean take = false,notTake = false;
        if(target - nums[ind] >= 0){
            take = fun(ind - 1 , target - nums[ind] , nums , dp);
        }
        notTake = fun(ind-1 , target , nums , dp);
        return dp[ind][target] = take || notTake;
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int x : nums){
            sum += x;
        }
        if(sum % 2 != 0){
            return false;
        }
        int target = sum/2;
        Boolean[][] dp = new Boolean[n][target+1];
        return fun(n-1 , target , nums , dp);
            }
}
