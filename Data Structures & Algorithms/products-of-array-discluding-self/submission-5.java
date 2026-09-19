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

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int zeroCnt = 0;
        int prod = 1;
        for(int i = 0;i < n;i++){
            if(nums[i] == 0){
                zeroCnt++;
            }
            else{
            prod *= nums[i];
            }
        }
        if(zeroCnt > 1){
            return ans;
        }
        for(int i = 0;i < n;i++){
            if(zeroCnt == 1){
                if(nums[i] == 0){
                    ans[i] = prod;
                }
                else{
                    ans[i] = 0;
                }
            }
            else{
            ans[i] = prod/nums[i];
            }
        }
        return ans;
    }
}  
