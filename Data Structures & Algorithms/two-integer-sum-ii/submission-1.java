// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int l = 0,r = numbers.length-1;
//         while(numbers[l] + numbers[r] != target){
//             if(numbers[l] + numbers[r] > target){
//                 r--;
//             }
//             else if(numbers[l] + numbers[r] < target){
//                 l++;
//             }
//         }
//         int[] ans = new int[2];
//         ans[0] = l+1;
//         ans[1] = r+1;
//         return ans; 
//     }
// }


class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for(int i = 0;i < n;i++){
            for(int j = i+1;j < n;j++){
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[0];
    }
}