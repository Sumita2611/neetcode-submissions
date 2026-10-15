class Solution {
    public int fun(int[] nums){
        int n = nums.length;
        int l = 0,h = n-1;
        int ans = Integer.MAX_VALUE;
        while(l <= h){
            int m = l + (h-l)/2;
            if(nums[l] <= nums[m]){
                ans = Math.min(nums[l] , ans);
                l = m+1;
            }
            else{
                ans = Math.min(ans , nums[m]);
                h = m-1;
            }
        }
        return ans;
    }
    public int findMin(int[] nums) {
        return fun(nums);
    }
}
