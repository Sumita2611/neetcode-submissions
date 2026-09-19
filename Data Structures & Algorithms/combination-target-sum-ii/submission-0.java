class Solution {
    public void fun(int ind,int[] candidates, int target,List<Integer> list,List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = ind;i < candidates.length;i++){
            if(i > ind && candidates[i] == candidates[i-1]){
                continue;
            }
            if(target < candidates[i]){
                break;
            }
            list.add(candidates[i]);
            fun(i+1,candidates,target-candidates[i],list,ans);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        fun(0,candidates,target,list,ans);
        return ans;
            }
}
