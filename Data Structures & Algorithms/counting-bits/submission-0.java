// class Solution {
//     public int[] countBits(int n) {
//         int[] ans = new int[n+1];
//         for(int i = 0;i <= n;i++){
//             int num = i;
//             int cnt = 0;
//             while(num > 0){
//                 if((num & 1) == 1){
//                     cnt++;
//                 }
//                 n = n >> 1;
//             }
//             ans[i] = cnt;
//         }
//         return ans;
//     }
// }


class Solution {
    public int[] countBits(int n) {
       int[] ans = new int[n+1];
       for(int i = 0;i <= n;i++){
        ans[i] = Integer.bitCount(i);
       }
       return ans;
    }
}