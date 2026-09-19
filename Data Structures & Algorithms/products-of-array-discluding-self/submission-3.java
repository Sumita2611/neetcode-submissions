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

// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int prod = 1,zeros = 0;
//         for(int x : nums){
//             if(x != 0){
//                 prod *= x;
//             }
//             else{
//                 zeros++;
//             }
//         }
//         if(zeros > 1){
//             return new int[n];
//         }
//         int[] ans = new int[n];
//         for(int i = 0;i < n;i++){
//             if(zeros > 0){
//                 ans[i] = (nums[i] == 0) ? prod : 0;
//             }
//             else{
//                 ans[i] = prod/nums[i];
//             }
//         }
//         return ans;
//     }
// } 


// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] left = new int[n];
//         int[] right = new int[n];
//         left[0] = 1;
//         right[n-1] = 1;
//         for(int i = 1;i < n;i++){
//             left[i] = left[i-1] * nums[i-1];
//         }
//         for(int i = n-2;i >= 0;i--){
//             right[i] = right[i+1] * nums[i+1];
//         }
//         int[] ans = new int[n];
//         for(int i = 0;i < n;i++){
//             ans[i] = left[i] * right[i];
//         }
//         return ans;
//     }
// } 


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;
        for(int i = 1;i < n;i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        int postfix = 1;
        for(int i = n-1;i >= 0;i--){
            ans[i] *= postfix;
            postfix *= nums[i];
        }
        return ans;
    }
} 
