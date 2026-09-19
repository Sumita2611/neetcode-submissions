// class Solution {
//     public void rotate(int[][] matrix) {
//         int n = matrix.length;
//         int[][] ans = new int[n][n];
//         for(int i = 0;i < n;i++){
//             for(int j = 0;j < n;j++){
//                 ans[j][n-1-i] = matrix[i][j];
//             }
//         }
//         for(int i = 0;i < n;i++){
//             for(int j = 0;j < n;j++){
//                 matrix[i][j] = ans[i][j];
//             }
//         }
//     }
// }

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //transpose
        for(int i = 0;i < n;i++){
            for(int j = i+1;j < n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                }
        }
        //reverse each row
        for(int i = 0;i < n;i++){
        int l = 0,r = n-1;
        while(l < r){
            int temp = matrix[i][l];
            matrix[i][l] = matrix[i][r];
            matrix[i][r] = temp;
            l++;
            r--;
        }
        }
    }
}
