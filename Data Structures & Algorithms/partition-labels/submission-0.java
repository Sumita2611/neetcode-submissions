class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        List<Integer> ans = new ArrayList<>();
        int[] lastInd = new int[26];
        for(int i = 0;i < n;i++){
            lastInd[s.charAt(i) - 'a'] = i;
        }
        int i = 0;
        while(i < n){
            int end = lastInd[s.charAt(i) - 'a'];
            int j = i;
            while(j < end){
                end = Math.max(end , lastInd[s.charAt(j) - 'a']);
                j++;
            }
            ans.add(j-i+1);
            i = j + 1;
        }
        return ans;
    }
}
