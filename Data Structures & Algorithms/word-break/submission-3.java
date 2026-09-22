class Solution {
    public boolean fun(int idx , String s , Set<String> set , Boolean[] dp){
        if(idx == s.length()){
            return true;
        }
        if(dp[idx] != null){
            return dp[idx];
        }
        for(int end = idx+1;end <= s.length();end++){
            String word = s.substring(idx , end);
            if(set.contains(word)){
                if(fun(end , s , set , dp)){
                    return dp[idx] = true;
                }
            }
        }
        return dp[idx] = false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        Boolean[] dp = new Boolean[n];
        Set<String> set = new HashSet<>(wordDict);
        return fun(0 , s , set , dp);
    }
}
