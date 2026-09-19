// class Solution {
//     public boolean isPalindrome(String s) {
//         StringBuilder sb = new StringBuilder();
//         for(char ch : s.toCharArray()){
//             if(Character.isLetterOrDigit(ch)){
//                 sb.append(Character.toLowerCase(ch));
//             }
//         }
//         String str = sb.toString();
//         String rev = sb.reverse().toString();
//         return str.equals(rev);
//     }
// }

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        int l = 0,r = sb.length()-1;
        while(l < r){
            if(sb.charAt(l) != sb.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
