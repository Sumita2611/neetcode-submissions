// class Solution {
//     public int fun(int ind , int[] cost){
//         int n = cost.length;
//         if(ind >= n){
//             return 0;
//         }
//         int step1 = fun(ind+1 , cost);
//         int step2 = fun(ind+2 , cost);
//         return cost[ind] + Math.min(step1 , step2);
//     }
//     public int minCostClimbingStairs(int[] cost) {
//         return Math.min(fun(0,cost) , fun(1,cost));
//     }
// }


class Solution {
    public int fun(int ind , int[] cost , int[] dp){
        int n = cost.length;
        if(ind >= n){
            return 0;
        }
        if(dp[ind] != -1){
            return dp[ind];
        }
        int step1 = fun(ind+1 , cost , dp);
        int step2 = fun(ind+2 , cost , dp);
        return dp[ind] = cost[ind] + Math.min(step1 , step2);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp , -1);
        return Math.min(fun(0,cost,dp) , fun(1,cost,dp));
    }
}