// class Solution {
//     public int singleNumber(int[] nums) {
//         Map<Integer,Integer> mp = new HashMap<>();
//         for(int x : nums){
//             mp.put(x , mp.getOrDefault(x,0)+1);
//         }
//         for(int x : nums){
//             if(mp.get(x) == 1){
//                 return x;
//             }
//         }
//         return -1;
//     }
// }

// class Solution {
//     public int singleNumber(int[] nums) {
//         int n = nums.length;
//         for(int i = 0;i < n;i++){
//             int ele = nums[i];
//             int cnt = 0;
//             for(int j = 0;j < n;j++){
//                 if(nums[j] == ele){
//                     cnt++;
//                 }
//             }
//                 if(cnt == 1){
//                     return ele;
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0;i < n;i++){
            ans ^= nums[i];
        }
        return ans;
    }
}
