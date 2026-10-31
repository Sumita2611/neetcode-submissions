class Solution {
    public int dfs(int[][] grid , int i , int j){
        int n = grid.length;
        int m = grid[0].length;
        if(i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == 0){
            return 0;
        }
        grid[i][j] = 0;
        int up = dfs(grid , i-1 , j);
        int down = dfs(grid , i+1 , j);
        int left = dfs(grid , i, j-1);
        int right = dfs(grid , i , j+1);
        return 1 + up + down + left + right;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxArea = 0;
        for(int i = 0;i < n;i++){
            for(int j =0;j < m;j++){
                int area = dfs(grid , i , j);
                maxArea = Math.max(area , maxArea);
            }
        }
        return maxArea;
    }
}
