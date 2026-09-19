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

// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int n = numbers.length;
//         HashMap<Integer,Integer> mp = new HashMap<>();
//         for(int i = 0;i < n;i++){
//             int rem = target - numbers[i];
//             if(mp.containsKey(rem)){
//                 return new int[]{mp.get(rem) + 1 , i+1};
//             }
//             mp.put(numbers[i] , i);
//         }
//         return new int[]{};
//     }
// }

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int l = 0,r = n-1;
        while(l < r){
            int sum = numbers[l] + numbers[r];
            if(sum == target){
                return new int[]{l+1 , r+1};
            }
            else if(sum < target){
                l++;
            }
            else{
                r--;
            }
        }
        return new int[]{};
    }
}
