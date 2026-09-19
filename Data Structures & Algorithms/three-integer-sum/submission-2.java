class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        for(int i = 0;i < n;i++){
            Set<Integer> set = new HashSet<>();
            for(int j = i+1;j < n;j++){
                int third = -(nums[i] + nums[j]);
                if(set.contains(third)){
                    List<Integer> list = Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(list);
                    ans.add(list);
                    }
                    set.add(nums[j]);
                }
        }
        return new ArrayList<>(ans);
    }
}
