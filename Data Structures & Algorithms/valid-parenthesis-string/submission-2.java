// class Solution {
//     public boolean fun(String s , int ind  , int cnt , Boolean[][] dp){
//         if(cnt < 0){
//             return false;
//         }
//         if(ind == s.length()){
//             return (cnt == 0);
//         }
//         if(dp[ind][cnt] != null){
//             return dp[ind][cnt];
//         }
//         if(s.charAt(ind) == '('){
//             return fun(s,ind+1,cnt+1,dp);
//         }
//         if(s.charAt(ind) == ')'){
//             return fun(s,ind+1,cnt-1,dp);
//         }
//         return fun(s , ind + 1 , cnt + 1,dp) || fun(s,ind+1,cnt-1,dp) || fun(s,ind+1,cnt,dp);
//     }
//     public boolean checkValidString(String s) {
//         int n = s.length();
//         Boolean[][] dp = new Boolean[n][n+1];
//         return fun(s,0,0,dp);
//     }
// }

class Solution {

    public boolean fun(String s, int ind, int cnt, Boolean[][] dp) {
        if (cnt < 0) {
            return false;
        }

        if (ind == s.length()) {
            return cnt == 0;
        }

        if (dp[ind][cnt] != null) {
            return dp[ind][cnt];
        }

        boolean ans;

        if (s.charAt(ind) == '(') {
            ans = fun(s, ind + 1, cnt + 1, dp);
        } 
        else if (s.charAt(ind) == ')') {
            ans = fun(s, ind + 1, cnt - 1, dp);
        } 
        else {
            ans = fun(s, ind + 1, cnt + 1, dp)
               || fun(s, ind + 1, cnt - 1, dp)
               || fun(s, ind + 1, cnt, dp);
        }

        return dp[ind][cnt] = ans;
    }

    public boolean checkValidString(String s) {
        int n = s.length();
        Boolean[][] dp = new Boolean[n][n + 1];
        return fun(s, 0, 0, dp);
    }
}
