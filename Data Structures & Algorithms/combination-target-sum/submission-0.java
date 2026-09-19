class Solution {
    public void fun(int ind,int[] nums, int target,List<Integer> list , List<List<Integer>> ans){
        if(ind == nums.length){
            if(target == 0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        //take
        if(nums[ind] <= target){
        list.add(nums[ind]);
        fun(ind,nums,target-nums[ind],list,ans);
        list.remove(list.size()-1);
        }
        fun(ind+1,nums,target,list,ans);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
         List<List<Integer>> ans = new ArrayList<>();
         List<Integer> list = new ArrayList<>();
         fun(0,nums,target,list,ans);
         return ans;
    }
}
