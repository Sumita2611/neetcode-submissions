// class Solution {
//     public boolean isAnagram(String s, String t) {
//         char[] sarr = s.toCharArray();
//         char[] tarr = t.toCharArray();
//         Arrays.sort(sarr);
//         Arrays.sort(tarr);
//         if(Arrays.equals(sarr,tarr)){
//             return true;
//         }
//         return false;
//     }
// }

class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> mp1 = new HashMap<>();
       HashMap<Character,Integer> mp2 = new HashMap<>();
       for(char ch : s.toCharArray()){
        mp1.put(ch,mp1.getOrDefault(ch,0)+1);
       }
       for(char ch : t.toCharArray()){
        mp2.put(ch,mp2.getOrDefault(ch,0)+1);
       }
       return mp1.equals(mp2);
    }
}