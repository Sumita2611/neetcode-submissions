// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int n = matrix.length;
//         int m = matrix[0].length;
//         int mark = -1000001;
//         for(int i = 0;i < n;i++){
//             for(int j = 0;j< m;j++){
//                 if(matrix[i][j] == 0){
//                     //row
//                     for(int k = 0;k < m;k++){
//                         if(matrix[i][k] != 0){
//                         matrix[i][k] =mark;
//                     }
//                     }
//                     //col
//                     for(int k = 0;k < n;k++){
//                         if(matrix[k][j] != 0){
//                         matrix[k][j] =mark;
//                     }
//                     }
//                 }
//             }
//         }
//         for(int i = 0;i < n;i++){
//             for(int j = 0;j < m;j++){
//                 if(matrix[i][j] == mark){
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }
// }

class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(matrix[i][j] == 0){
                    row[i] =1;
                    col[j] = 1;
                }
            }
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
