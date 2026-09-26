class Solution {
    public int fun(int[] nums, int target, int n , int[][] dp , int offset){
        if(n < 0){
            if(target == 0){
                return 1;
            }
            return 0;
        }
        if(target < -offset || target > offset){
            return 0;
        }
        if(dp[n][target+offset] != -1){
            return dp[n][target+offset];
        }
        int waysAdd = fun(nums , target+nums[n] , n-1 , dp , offset);
        int waysSubtract = fun(nums , target-nums[n] , n-1 , dp , offset);
        return dp[n][target+offset] = waysAdd + waysSubtract;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        for(int x : nums){
            sum += x;
        }
        if(target > sum || target < -sum){
            return 0;
        }
        int offset = sum;
        int[][] dp = new int[n][2*sum+1];
        for(int[] d : dp){
            Arrays.fill(d , -1);
        }
        return fun(nums,target,n-1,dp,offset);
    }
}
