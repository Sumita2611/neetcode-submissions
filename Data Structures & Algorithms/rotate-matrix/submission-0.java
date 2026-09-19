class Solution {
    public void revRow(int[] row){
        int l = 0,r = row.length-1;
        while(l < r){
            int temp = row[l];
            row[l] = row[r];
            row[r] = temp;
            l++;
            r--;
        }
    }
    public void rotate(int[][] matrix) {
        //transpose
        for(int i = 0;i < matrix.length;i++){
            for(int j = i+1;j < matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0;i < matrix.length;i++){
            revRow(matrix[i]);
        }
    }
}
