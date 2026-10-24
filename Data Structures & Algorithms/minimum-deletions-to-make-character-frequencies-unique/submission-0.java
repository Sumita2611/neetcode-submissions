class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i < 26;i++){
            while(freq[i] > 0 && set.contains(freq[i])){
                freq[i]--;
                ans++;
            }
            set.add(freq[i]);
        }
        return ans;
    }
}
