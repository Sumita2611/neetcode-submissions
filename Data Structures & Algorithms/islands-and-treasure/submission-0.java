class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int[] delRow = {-1 , 1 , 0 , 0};
        int[] delCol = {0 , 0 , -1 , 1};
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(grid[i][j] == 0){
                    q.offer(new int[]{i , j});
                }
            }
        }
        while(!q.isEmpty()){
            int[] cell = q.poll();
            int row = cell[0];
            int col = cell[1];
            for(int i = 0;i < 4;i++){
                int nrow = row + delRow[i];
                int ncol = col + delCol[i];
                if(nrow < 0 || nrow >= n || ncol < 0 || ncol >= m){
                    continue;
                }
                if(grid[nrow][ncol] == Integer.MAX_VALUE){
                    grid[nrow][ncol] = grid[row][col] + 1;
                    q.offer(new int[]{nrow , ncol});
                }
            }
        }
    }
}
