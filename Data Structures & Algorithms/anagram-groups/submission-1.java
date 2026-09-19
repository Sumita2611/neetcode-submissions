class Solution {
    public boolean fun(String s1,String s2){
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] vis = new boolean[strs.length];
        for(int i = 0;i < strs.length;i++){
            if(vis[i]){
                continue;
            }
            List<String> grp = new ArrayList<>();
            grp.add(strs[i]);
            vis[i] = true;
            for(int j = i+1;j < strs.length;j++){
                if(!vis[j] && fun(strs[i],strs[j])){
                    grp.add(strs[j]);
                    vis[j] = true;
                }
            }
                ans.add(grp);
        }
        return ans;
    }
}
