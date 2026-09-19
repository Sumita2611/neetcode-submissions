class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        StringBuilder sb = new StringBuilder(t);
        for(char ch : s.toCharArray()){
            int idx = sb.indexOf(String.valueOf(ch));
            if(idx == -1){
                return false;
            }
            sb.deleteCharAt(idx);
        }
        return true;
    }
}
