class Solution {    
    public void fun(int ind , int[] nums,List<Integer> list,List<List<Integer>> ans){
        if(ind == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        //take
        list.add(nums[ind]);
        fun(ind+1,nums,list,ans);
        list.remove(list.size()-1);
        //not take 
        fun(ind+1,nums,list,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        fun(0,nums,list,ans);
        return ans;
    }
}
