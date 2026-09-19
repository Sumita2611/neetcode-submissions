// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] ans = new int[n];
//         for(int i = 0;i < n;i++){
//             int prod = 1;
//             for(int j = 0;j < n;j++){
//                 if(i != j){
//                     prod *= nums[j];
//                 }
//             }
//             ans[i] = prod;
//         }
//         return ans;
//     }
// }  

// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] ans = new int[n];
//         int zeroCnt = 0;
//         int prod = 1;
//         for(int i = 0;i < n;i++){
//             if(nums[i] == 0){
//                 zeroCnt++;
//             }
//             else{
//             prod *= nums[i];
//             }
//         }
//         if(zeroCnt > 1){
//             return ans;
//         }
//         for(int i = 0;i < n;i++){
//             if(zeroCnt == 1){
//                 if(nums[i] == 0){
//                     ans[i] = prod;
//                 }
//                 else{
//                     ans[i] = 0;
//                 }
//             }
//             else{
//             ans[i] = prod/nums[i];
//             }
//         }
//         return ans;
//     }
// }  

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 1;
        for(int i = 1;i < n;i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        suffix[n-1] = 1;
        for(int i = n-2;i >= 0;i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        //ans
        for(int i = 0;i < n;i++){
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }
}  
