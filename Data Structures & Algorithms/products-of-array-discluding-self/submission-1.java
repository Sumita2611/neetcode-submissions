// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] ans = new int[n];
//         for(int i = 0;i < n;i++){
//             ans[i] = 1;
//             for(int j = 0;j < n;j++){
//                 if(i != j){
//                 ans[i] *= nums[j];
//             }
//             }
//         }
//         return ans;
//     }
// }  

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prod = 1,zeros = 0;
        for(int x : nums){
            if(x != 0){
                prod *= x;
            }
            else{
                zeros++;
            }
        }
        if(zeros > 1){
            return new int[n];
        }
        int[] ans = new int[n];
        for(int i = 0;i < n;i++){
            if(zeros > 0){
                ans[i] = (nums[i] == 0) ? prod : 0;
            }
            else{
                ans[i] = prod/nums[i];
            }
        }
        return ans;
    }
} 
