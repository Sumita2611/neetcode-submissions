class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            if(set.contains(x)){
                return true;
            }
            set.add(x);
        }
        return false;
    }
}