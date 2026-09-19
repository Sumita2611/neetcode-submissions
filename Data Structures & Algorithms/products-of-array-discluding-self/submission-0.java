class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0;i < n;i++){
            ans[i] = 1;
            for(int j = 0;j < n;j++){
                if(i != j){
                ans[i] *= nums[j];
            }
            }
        }
        return ans;
    }
}  
