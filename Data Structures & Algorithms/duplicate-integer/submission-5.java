// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         int n = nums.length;
//         HashSet<Integer> set = new HashSet<>();
//         for(int x : nums){
//             if(set.contains(x)){
//                 return true;
//             }
//             set.add(x);
//         }
//         return false;
//     }
// }

class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int x : nums){
            mp.put(x , mp.getOrDefault(x,0)+1);
        }
        for(int x : mp.keySet()){
            if(mp.get(x) > 1){
                return true;
            }
        }
        return false;
    }
}