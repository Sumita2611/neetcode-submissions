// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         for(int i = 0;i < n;i++){
//             for(int j = i+1;j < n;j++){
//                 if(nums[i] + nums[j] == target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer , Integer> mp = new HashMap<>();
        for(int i = 0;i < n;i++){
            mp.put(nums[i] , i);
        }
        for(int i = 0;i < n;i++){
            int comp = target - nums[i];
            if(mp.containsKey(comp) && mp.get(comp) != i){
                return new int[]{Math.min(mp.get(comp) , i) , Math.max(mp.get(comp) , i)};
            }
        }
        return new int[]{};
    }
}
