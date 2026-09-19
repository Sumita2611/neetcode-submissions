// class Solution {
//     public int climbStairs(int n) {
//         if(n <= 2){
//             return n;
//         }
//         return climbStairs(n-1) + climbStairs(n-2);
//     }
// }


class Solution {
    public int fun(int n,int[] dp){
        if(n <= 2){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int left = fun(n-1,dp);
        int right = fun(n-2,dp);
        return dp[n] = left + right;
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return fun(n,dp);
    }
}