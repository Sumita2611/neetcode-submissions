// class Solution {
//     public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for(int i = 0;i < nums.length-1;i++){
//             if(nums[i] == nums[i+1]){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }


class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            if(set.contains(x)){
                return x;
            }
            set.add(x);
        }
        return -1;
    }
}