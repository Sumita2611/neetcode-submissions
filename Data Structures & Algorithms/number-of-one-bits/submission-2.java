// class Solution {
//     public int hammingWeight(int n) {
//         return Integer.bitCount(n);
//     }
// }

// class Solution {
//     public int hammingWeight(int n) {
//         int cnt = 0;
//         while(n != 0){
//             cnt++;
//         n = n & (n-1);
//         }
//         return cnt;
//     }
// }


class Solution {
    public int hammingWeight(int n) {
        int cnt = 0;
        while(n > 0){
            int rem = n % 2;
            if(rem == 1){
                cnt++;
            }
            n /= 2;
        }
        return cnt;
    }
}