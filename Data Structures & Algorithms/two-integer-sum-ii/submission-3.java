// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int n = numbers.length;
//         for(int i = 0;i < n;i++){
//             for(int j = i+1;j < n;j++){
//                 if(numbers[i] + numbers[j] == target){
//                     return new int[]{i+1 , j+1};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i < n;i++){
            int rem = target - numbers[i];
            if(mp.containsKey(rem)){
                return new int[]{mp.get(rem) + 1 , i+1};
            }
            mp.put(numbers[i] , i);
        }
        return new int[]{};
    }
}
