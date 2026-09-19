class Solution {
    public void fun(int[] nums,boolean[] vis,List<Integer> list,List<List<Integer>> ans){
        if(list.size() == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0;i < nums.length;i++){
            if(!vis[i]){
                list.add(nums[i]);
                vis[i] = true;
                fun(nums,vis,list,ans);
                list.remove(list.size()-1);
                vis[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        boolean[] vis = new boolean[n];
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        fun(nums,vis,list,ans);
        return ans;
    }
}
