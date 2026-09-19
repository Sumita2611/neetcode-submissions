// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         int[] ans = new int[2];
//         for(int i = 0;i < n;i++){
//             for(int j = i+1;j < n;j++){
//                 if(nums[i] +  nums[j] == target){
//                     ans[0] = i;
//                     ans[1] = j;
//                 }
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i < n;i++){
            int a = nums[i];
            int more = target-a;
            if(mp.containsKey(more)){
                return new int[]{mp.get(more),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{};
    }
}
