// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         HashMap<Integer,Integer> mp = new HashMap<>();
//         for(int x : nums){
//             mp.put(x,mp.getOrDefault(x,0)+1);
//         }
//         for(int x : mp.keySet()){
//             if(mp.get(x) > 1){
//                 return true;
//             }
//         }
//         return false;
//     }
// }

// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         int n = nums.length;
//         for(int i = 0;i < n;i++){
//             for(int j = i+1;j < n;j++){
//                 if(nums[i] == nums[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 1;i < n;i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
}