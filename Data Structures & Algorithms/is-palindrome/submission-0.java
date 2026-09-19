class Solution {
    public boolean isPalindrome(String s) {
        String newStr = s.toLowerCase();
        int l = 0,r = s.length()-1;
        while(l < r){
            while(l < r && !Character.isLetterOrDigit(newStr.charAt(l))){
                l++;
            }
             while(l < r && !Character.isLetterOrDigit(newStr.charAt(r))){
                r--;
            }
            if(newStr.charAt(l) != newStr.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
