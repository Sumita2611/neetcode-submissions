class Solution {
    public boolean fun(int i , int j , String s){
        if(i >= j){
            return true;
        }
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        return fun(i+1 , j-1 , s);
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0,maxLen = 1;
        for(int i = 0;i < n;i++){
            for(int j = i;j < n;j++){
                if(fun(i , j , s)){
                int len = j-i+1;
                if(len > maxLen){
                    maxLen = len;
                    start = i;
                }
            }
            }
        }
        return s.substring(start , start + maxLen);
    }
}
